package com.cehn17.spring.data.jpa.productDetail.infrastructure;

import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import com.cehn17.spring.data.jpa.product.infrastructure.database.entity.ProductEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "product_details")
public class ProductDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    private String warranty;
    private String provider;

    @OneToOne(mappedBy = "productDetailEntity")
    private ProductEntity productEntity;
}
