package com.cehn17.spring.data.jpa.product.domain.entity;

import com.cehn17.spring.data.jpa.category.domain.Category;
import com.cehn17.spring.data.jpa.productDetail.domain.ProductDetail;
import com.cehn17.spring.data.jpa.review.domain.Review;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class Product {
    private Long id;
    private String name;
    private String description;
    private Double price;
    private String image;

    private ProductDetail productDetail;
    private List<Review> reviews;
    private List<Category> categories;

}
