package com.cehn17.spring.data.jpa.product.domain.port;

import com.cehn17.spring.data.jpa.common.domain.PaginationQuery;
import com.cehn17.spring.data.jpa.common.domain.PaginationResult;
import com.cehn17.spring.data.jpa.product.domain.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {

    Product upsert(Product product);

    Optional<Product> findById(Long id);

    PaginationResult<Product> findAll(PaginationQuery paginationQuery);

    void deleteById(Long id);
}
