package com.multipolar.bootcamp.spring.appecommerce.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "master_pelanggan")
public class Pelanggan {

    @Id
    @GenericGenerator(name = "uuid_gen", strategy = "uuid2")
    @GeneratedValue(generator = "uuid_gen")
    @Column(name = "id_pelanggan", nullable = false, unique = true)
    private String id_pelanggan;

    @Column(name = "nama", nullable = false)
    private String nama;

    @Column(name = "alamat")
    private String alamat;

    @Column(name = "kontak")
    private String kontak;

    @JsonIgnore
    @OneToMany(mappedBy = "pelanggan")
    public List<Transaksi> transaksiList = new ArrayList<>();
}
