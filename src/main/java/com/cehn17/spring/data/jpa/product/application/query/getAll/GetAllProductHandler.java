package com.cehn17.spring.data.jpa.product.application.query.getAll;

import com.cehn17.spring.data.jpa.common.application.mediator.RequestHandler;
import com.cehn17.spring.data.jpa.common.domain.PaginationResult;
import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import com.cehn17.spring.data.jpa.product.domain.port.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class GetAllProductHandler implements RequestHandler<GetAllProductRequest, GetAllProductResponse> {

    private final ProductRepository productRepository;

    @Override
    public GetAllProductResponse handle(GetAllProductRequest request) {

        log.info("Getting all products");

        PaginationResult<Product> products = productRepository.findAll(request.getPaginationQuery(), request.getProductFilter());

        log.info("Products found: {}", products);

        return new GetAllProductResponse(products);
    }

    @Override
    public Class<GetAllProductRequest> getRequestType() {
        return GetAllProductRequest.class;
    }
}
