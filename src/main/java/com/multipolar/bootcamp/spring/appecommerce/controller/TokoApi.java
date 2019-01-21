package com.multipolar.bootcamp.spring.appecommerce.controller;

import com.multipolar.bootcamp.spring.appecommerce.entity.Toko;
import com.multipolar.bootcamp.spring.appecommerce.repository.TokoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/toko")
public class TokoApi {

    @Autowired
    private TokoRepository repository;

    @GetMapping("/list")
    public Iterable<Toko> findAll() {
        return repository.findAll();
    }

    @PostMapping("/")
    public ResponseEntity<Toko> save(
            @RequestBody Toko toko
    ){
        toko = repository.save(toko);
        return ResponseEntity.ok(toko);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Toko> findById(
            @PathVariable("id") String tokoId
    ){
        Optional<Toko> tokoOptional = repository.findById(tokoId);

        if(tokoOptional.isPresent()){
            return ResponseEntity.ok(tokoOptional.get());
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Toko> deleteById(String tokoId){
        Optional<Toko> tokoOptional = repository.findById(tokoId);

        if(tokoOptional.isPresent()){
            repository.deleteById(tokoId);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.noContent().build();
        }

    }
}
