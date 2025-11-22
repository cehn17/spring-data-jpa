package com.cehn17.spring.data.jpa.product.application.query.getAll;

import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class GetAllProductResponse {

    private List<Product> products;
}

