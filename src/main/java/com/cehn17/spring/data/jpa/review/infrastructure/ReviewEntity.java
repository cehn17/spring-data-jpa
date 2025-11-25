package com.cehn17.spring.data.jpa.review.infrastructure;

import com.cehn17.spring.data.jpa.product.infrastructure.database.entity.ProductEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reviews")
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String comment;
    private Integer score;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private ProductEntity productEntity;
}
