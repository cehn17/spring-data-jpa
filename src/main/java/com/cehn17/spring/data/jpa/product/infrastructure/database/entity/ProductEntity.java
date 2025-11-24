package com.cehn17.spring.data.jpa.product.infrastructure.database.entity;

import com.cehn17.spring.data.jpa.productDetail.infrastructure.ProductDetailEntity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name ="products")
@Data
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 500)
    private String description;
    private Double price;
    private String image;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "product_detail_id")
    private ProductDetailEntity productDetailEntity;

}

