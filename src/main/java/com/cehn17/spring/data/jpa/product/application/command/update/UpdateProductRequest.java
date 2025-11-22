package com.cehn17.spring.data.jpa.product.application.command.update;

import com.cehn17.spring.data.jpa.common.mediator.Request;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

@Data
public class UpdateProductRequest implements Request<Void> {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private MultipartFile file;
}
