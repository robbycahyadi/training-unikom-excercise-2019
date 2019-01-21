package com.multipolar.bootcamp.spring.appecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "transaksi_detail")
public class TransaksiDetail {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id_transaksi_detail", nullable = false, unique = true)
    private String id_transaksi_detail;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "id_transaksi", nullable = false)
    private Transaksi transaksi;

    @ManyToOne
    @JoinColumn(name = "id_produk", nullable = false)
    private Produk produk;

    @Column(name = "jumlah_produk", nullable = false)
    private int jumlah_produk;
}
