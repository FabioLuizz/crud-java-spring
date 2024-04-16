package com.example.crud.controllers;

import com.example.crud.domain.product.Product;
import com.example.crud.domain.product.RequestProduct;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private JpaRepository repository;

    @GetMapping
    public ResponseEntity getAllProducts() {
        var products = repository.findAll();
        return ResponseEntity.ok(products);
    }

    @PostMapping
    public ResponseEntity setProduct(@RequestBody @Valid RequestProduct data) {
        Product product = new Product(data);
        repository.save(product);
        return ResponseEntity.ok("Produto cadastrado com sucesso!");
    }

    @PutMapping
    @Transactional
    public ResponseEntity updateProduct(@RequestBody @Valid RequestProduct data) {
        Optional<Product> optionalProduct = repository.findById(data.id());
        if(optionalProduct.isPresent()) {
            var product = optionalProduct.get();
            product.setName(data.name());
            product.setPrice_in_cents(data.price_in_cents());
            repository.save(product);
            return ResponseEntity.ok("Produto atualizado com sucesso");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
