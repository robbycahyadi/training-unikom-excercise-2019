package com.multipolar.bootcamp.spring.appecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "master_produk")
public class Produk {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id_produk", nullable = false, unique = true)
    private String id_produk;

    @Column(name = "nama", nullable = false)
    private String nama;

    @Column(name = "harga")
    private BigInteger harga;

    @Type(type = "text")
    @Column(name = "deskripsi")
    private String deskripsi;
}
