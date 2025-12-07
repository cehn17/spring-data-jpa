package com.cehn17.spring.data.jpa.category.domain;

import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Category {

    private Long id;
    private String name;

    private List<Product> products;

}
