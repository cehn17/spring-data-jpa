package com.cehn17.spring.data.jpa.product.application.command.delete;

import com.cehn17.spring.data.jpa.common.application.mediator.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DeleteProductRequest implements Request<Void> {

    private Long id;
}
