package com.cehn17.spring.data.jpa.product.infrastructure.database.repository;

import com.cehn17.spring.data.jpa.product.infrastructure.database.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryProductRepository extends JpaRepository<ProductEntity, Long> {
}
