package com.multipolar.bootcamp.spring.appecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "master_transaksi")
public class Transaksi {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id_transaksi", nullable = false, unique = true)
    private String id_transaksi;

    @Column(name = "tanggal_transaksi", nullable = false)
    private Timestamp tanggal_transaksi;

    @ManyToOne
    @JoinColumn(name = "id_toko", nullable = false)
    private Toko toko;

    @ManyToOne
    @JoinColumn(name = "id_pelanggan", nullable = false)
    private  Pelanggan pelanggan;

    @Column(name = "total_harga", nullable = false)
    private BigInteger total_harga;

    @OneToMany(mappedBy = "transaksi")
    public List<TransaksiDetail> transaksiDetailList = new ArrayList<>();
}
