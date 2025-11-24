package com.cehn17.spring.data.jpa.productDetail.domain;

import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDetail {

    private Long id;
    private String description;
    private String warranty;
    private String provider;

    private Product product;

}
