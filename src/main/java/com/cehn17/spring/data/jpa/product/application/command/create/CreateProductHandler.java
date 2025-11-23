package com.cehn17.spring.data.jpa.product.application.command.create;

import com.cehn17.spring.data.jpa.common.mediator.RequestHandler;
import com.cehn17.spring.data.jpa.common.util.FileUtils;
import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import com.cehn17.spring.data.jpa.product.domain.port.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CreateProductHandler implements RequestHandler<CreateProductRequest,CreateProductResponse> {

    private final ProductRepository productRepository;
    private final FileUtils fileUtils;

    @Override
    public CreateProductResponse handle(CreateProductRequest request) {

        log.info("Creating Product");

        String uniqueFileName = fileUtils.saveProductImage(request.getFile());

        Product product = Product.builder()
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .image(uniqueFileName)
                .build();
        Product storedProduct = productRepository.upsert(product);

        log.info("Saved product with id {}" , storedProduct.getId());

        return new CreateProductResponse(storedProduct);

    }


    @Override
    public Class<CreateProductRequest> getRequestType() {
        return CreateProductRequest.class;
    }
}
