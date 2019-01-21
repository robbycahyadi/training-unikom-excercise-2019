package com.multipolar.bootcamp.spring.appecommerce.service;

import com.multipolar.bootcamp.spring.appecommerce.entity.Produk;
import com.multipolar.bootcamp.spring.appecommerce.entity.Transaksi;
import com.multipolar.bootcamp.spring.appecommerce.entity.TransaksiDetail;
import com.multipolar.bootcamp.spring.appecommerce.repository.ProdukRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransaksiDetailRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class TransaksiService {

    @Autowired
    private TransaksiRepository transaksiRepository;

    @Autowired
    private TransaksiDetailRepository transaksiDetailRepository;

    @Autowired
    private ProdukRepository produkRepository;

    public Iterable<Transaksi> findAll() {
        return transaksiRepository.findAll();
    }

    public Optional<Transaksi> findById(String id) {
        return this.transaksiRepository.findById(id);
    }

    @Transactional
    public Transaksi beliBarang(Transaksi transaksi) {
        BigInteger total_harga = new BigInteger("0");
        BigInteger total_harga_per_produk = new BigInteger("0");
        int jumlah_produk = 0;

        List<TransaksiDetail> newDetail = transaksi.getTransaksiDetailList();
        transaksi = transaksiRepository.save(transaksi);
        for (TransaksiDetail details : newDetail) {
            Optional<Produk> produk = produkRepository.findById(details.getProduk().getId_produk());
            if(produk.isPresent()){
                jumlah_produk = details.getJumlah_produk();
                total_harga_per_produk = produk.get().getHarga().multiply(BigInteger.valueOf(jumlah_produk));
                total_harga = total_harga.add(total_harga_per_produk);
            }
            details.setTransaksi(transaksi);
            transaksiDetailRepository.save(details);
        }
        transaksi.setTotal_harga(total_harga);
        Optional<Transaksi> transactionOptional = transaksiRepository.findById(transaksi.getId_transaksi());
        return transactionOptional.get();
    }

}
