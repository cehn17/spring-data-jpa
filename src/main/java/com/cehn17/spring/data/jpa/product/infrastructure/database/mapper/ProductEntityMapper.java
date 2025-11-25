package com.cehn17.spring.data.jpa.product.infrastructure.database.mapper;

import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import com.cehn17.spring.data.jpa.product.infrastructure.database.entity.ProductEntity;
import com.cehn17.spring.data.jpa.review.domain.Review;
import com.cehn17.spring.data.jpa.review.infrastructure.ReviewEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ProductEntityMapper {

    @Mapping(target = "productDetailEntity", source = "productDetail")
    @Mapping(target = "productDetailEntity.productEntity", ignore = true)
    ProductEntity mapToProductEntity(Product product);

    @Mapping(target = "productDetail", source = "productDetailEntity")
    @Mapping (target = "productDetail.product", ignore = true)
    Product mapToProduct(ProductEntity productEntity);

    @Mapping (target = "product", ignore = true)
    Review maptoReview(ReviewEntity reviewEntity);

    @Mapping (target = "productEntity", ignore = true)
    ReviewEntity mapToReviewEntity(Review review);
}
