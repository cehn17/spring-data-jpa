package com.cehn17.spring.data.jpa.product.application.command.create;

import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class CreateProductResponse {

    private Product product;

}
