package com.cehn17.spring.data.jpa.product.application.command.delete;

import com.cehn17.spring.data.jpa.common.application.mediator.RequestHandler;
import com.cehn17.spring.data.jpa.product.domain.port.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class DeleteProductHandler implements RequestHandler<DeleteProductRequest,Void> {

    private final ProductRepository productRepository;

    @Override
    public Void handle(DeleteProductRequest request) {

        log.info("Eliminando producto con id: " + request.getId() + " ...");

        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        productRepository.deleteById(request.getId());

        log.info("Producto eliminado con id: " + request.getId());
        return null;

    }

    @Override
    public Class<DeleteProductRequest> getRequestType() {
        return DeleteProductRequest.class;
    }
}
