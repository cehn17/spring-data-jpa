package com.cehn17.spring.data.jpa.product.application.command.update;

import com.cehn17.spring.data.jpa.common.application.mediator.Request;
import com.cehn17.spring.data.jpa.review.domain.Review;
import lombok.Data;

@Data
public class UpdateProductRequest implements Request<Void> {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private String provider;
    private Review review;
    private Long categoryId;

}
