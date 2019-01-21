package com.multipolar.bootcamp.spring.appecommerce.service;

import com.multipolar.bootcamp.spring.appecommerce.entity.Transaksi;
import com.multipolar.bootcamp.spring.appecommerce.entity.TransaksiDetail;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransaksiDetailRepository;
import com.multipolar.bootcamp.spring.appecommerce.repository.TransaksiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class TransaksiService {

    @Autowired
    private TransaksiRepository transaksiRepository;
    @Autowired
    private TransaksiDetailRepository transaksiDetailRepository;

    public Iterable<Transaksi> findAll() {
        return transaksiRepository.findAll();
    }

    public Optional<Transaksi> findById(String id) {
        return this.transaksiRepository.findById(id);
    }

    @Transactional
    public Transaksi beliBarang(Transaksi transaksi) {
        List<TransaksiDetail> newDetail = transaksi.getTransaksiDetailList();
        transaksi = transaksiRepository.save(transaksi);
        for (TransaksiDetail details : newDetail) {
            details.setTransaksi(transaksi);
            transaksiDetailRepository.save(details);
        }
        Optional<Transaksi> transactionOptional = transaksiRepository.findById(transaksi.getId_transaksi());
        return transactionOptional.get();
    }

}
