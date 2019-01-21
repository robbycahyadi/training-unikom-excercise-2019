package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Pelanggan;
import com.multipolar.bootcamp.spring.appecommerce.repository.PelangganRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/pelanggan")
public class PelangganApi {

    @Autowired
    private PelangganRepository repository;

    @GetMapping("/list")
    public Iterable<Pelanggan> findAll() {
        return repository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Pelanggan> save(
            @RequestBody Pelanggan pelanggan
    ){
        pelanggan = repository.save(pelanggan);
        return ResponseEntity.ok(pelanggan);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pelanggan> findById(
            @PathVariable("id") String pelangganId
    ){
        Optional<Pelanggan> produkOptional = repository.findById(pelangganId);

        if(produkOptional.isPresent()){
            return ResponseEntity.ok(produkOptional.get());
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Pelanggan> deleteById(String pelangganId){
        Optional<Pelanggan> produkOptional = repository.findById(pelangganId);

        if(produkOptional.isPresent()){
            repository.deleteById(pelangganId);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.noContent().build();
        }

    }
}
