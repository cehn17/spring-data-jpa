package com.cehn17.spring.data.jpa.productDetail.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryProductDetailRepository extends JpaRepository<ProductDetailEntity, Long> {
}
