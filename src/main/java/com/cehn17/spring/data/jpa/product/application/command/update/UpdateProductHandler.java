package com.cehn17.spring.data.jpa.product.application.command.update;

import com.cehn17.spring.data.jpa.category.domain.Category;
import com.cehn17.spring.data.jpa.category.infrastructure.CategoryEntityMapper;
import com.cehn17.spring.data.jpa.category.infrastructure.QueryCategoryRepository;
import com.cehn17.spring.data.jpa.common.application.mediator.RequestHandler;
import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import com.cehn17.spring.data.jpa.product.domain.exception.ProductNotFoundException;
import com.cehn17.spring.data.jpa.product.domain.port.ProductRepository;
import com.cehn17.spring.data.jpa.productDetail.domain.ProductDetail;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UpdateProductHandler implements RequestHandler<UpdateProductRequest,Void> {

    private final ProductRepository productRepository;
    private final QueryCategoryRepository queryCategoryRepository;
    private final CategoryEntityMapper categoryEntityMapper;

    @Override
    public Void handle(UpdateProductRequest request) {

        log.info("Updating product with id {}", request.getId());

        Product product = productRepository.findById(request.getId()).orElseThrow(() -> new ProductNotFoundException(request.getId()));

        ProductDetail productDetail = product.getProductDetail();

        productDetail.setProvider(request.getProvider());

        product.getReviews().add(request.getReview());

        Category category = queryCategoryRepository.findById(request.getCategoryId())
                .map(categoryEntityMapper::mapToCategory)
                .orElseThrow(() -> new RuntimeException("Category not found"));

        product.getCategories().add(category);

        productRepository.upsert(product);

        log.info("Updated product with id {}", request.getId());

        return null;
    }

    @Override
    public Class<UpdateProductRequest> getRequestType() {
        return UpdateProductRequest.class;
    }
}
