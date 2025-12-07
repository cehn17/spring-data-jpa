package com.cehn17.spring.data.jpa.product.infrastructure.database.mapper;

import com.cehn17.spring.data.jpa.category.domain.Category;
import com.cehn17.spring.data.jpa.category.infrastructure.CategoryEntity;
import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import com.cehn17.spring.data.jpa.product.infrastructure.database.entity.ProductEntity;
import com.cehn17.spring.data.jpa.review.domain.Review;
import com.cehn17.spring.data.jpa.review.infrastructure.ReviewEntity;
import org.mapstruct.*;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ProductEntityMapper {

    @Mapping(target = "productDetail.product", ignore = true)
    ProductEntity mapToProductEntity(Product product);

    @Mapping(target = "productDetail.product", ignore = true)
    Product mapToProduct(ProductEntity productEntity);

    @Mapping(target = "product", ignore = true)
    Review mapToReview(ReviewEntity reviewEntity);

    @Mapping(target = "product", ignore = true)
    ReviewEntity mapToReviewEntity(Review review);

    @Mapping(target = "products", ignore = true)
    Category mapToCategory(CategoryEntity categoryEntity);

    @Mapping(target = "products", ignore = true)
    CategoryEntity mapToCategoryEntity(Category category);

    @AfterMapping
    default void linkReviews(@MappingTarget ProductEntity productEntity) {
        if (productEntity.getReviews() != null) {
            productEntity.getReviews().forEach(r -> r.setProduct(productEntity));
        }
    }
}
