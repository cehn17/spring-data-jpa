package com.cehn17.spring.data.jpa.product.infrastructure.api.mapper;

import com.cehn17.spring.data.jpa.category.domain.Category;
import com.cehn17.spring.data.jpa.product.application.command.create.CreateProductRequest;
import com.cehn17.spring.data.jpa.product.application.command.update.UpdateProductRequest;
import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import com.cehn17.spring.data.jpa.product.infrastructure.api.dto.CreateProductDto;
import com.cehn17.spring.data.jpa.product.infrastructure.api.dto.ProductDto;
import com.cehn17.spring.data.jpa.product.infrastructure.api.dto.ReviewDto;
import com.cehn17.spring.data.jpa.product.infrastructure.api.dto.UpdateProductDto;
import com.cehn17.spring.data.jpa.review.domain.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, unmappedTargetPolicy = ReportingPolicy.ERROR)
public interface ProductMapper {

    CreateProductRequest mapToCreateProductRequest(CreateProductDto createProductDto);

    UpdateProductRequest mapToUpdateProductRequest(UpdateProductDto updateProductDto);

    @Mapping(target = "provider", source = "productDetail.provider")
    ProductDto mapToProductDto(Product product);

    @Mapping(target = "product", ignore = true)
    Review mapToReview(ReviewDto reviewDto);

    default List<String> mapToCategoryNames(List<Category> categories) {
        return categories.stream().map(Category::getName).toList();
    }
}
