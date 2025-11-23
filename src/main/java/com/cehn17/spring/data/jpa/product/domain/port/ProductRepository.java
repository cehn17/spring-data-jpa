package com.cehn17.spring.data.jpa.product.domain.port;

import com.cehn17.spring.data.jpa.product.domain.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    Product upsert(Product product);

    Optional<Product> findById(Long id);

    List<Product> findAll();

    void deleteById(Long id);
}
