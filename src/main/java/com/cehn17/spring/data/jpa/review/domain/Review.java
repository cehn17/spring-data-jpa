package com.cehn17.spring.data.jpa.review.domain;

import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Review {

    private Long id;
    private String comment;
    private Integer score;

    private Product product;
}
