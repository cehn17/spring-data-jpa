package com.cehn17.spring.data.jpa.product.application.command.create;

import com.cehn17.spring.data.jpa.common.application.mediator.Request;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class CreateProductRequest implements Request<CreateProductResponse> {

    private String name;
    private String description;
    private Double price;
    private MultipartFile file;
}
