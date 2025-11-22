package com.cehn17.spring.data.jpa.product.application.command.update;

import com.cehn17.spring.data.jpa.common.mediator.RequestHandler;
import com.cehn17.spring.data.jpa.common.util.FileUtils;
import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import com.cehn17.spring.data.jpa.product.domain.port.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UpdateProductHandler implements RequestHandler<UpdateProductRequest,Void> {

    private final ProductRepository productRepository;
    private final FileUtils fileUtils;

    @Override
    public Void handle(UpdateProductRequest request) {

        String uniqueFileName = fileUtils.saveProductImage(request.getFile());

        Product product = Product.builder()
                .id(request.getId())
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .image(uniqueFileName)
                .build();
        productRepository.upsert(product);
        return null;

    }

    @Override
    public Class<UpdateProductRequest> getRequestType() {
        return UpdateProductRequest.class;
    }
}
