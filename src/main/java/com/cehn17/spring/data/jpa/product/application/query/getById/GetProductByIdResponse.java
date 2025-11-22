package com.cehn17.spring.data.jpa.product.application.query.getById;

import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class GetProductByIdResponse {

    private Product product;
}

