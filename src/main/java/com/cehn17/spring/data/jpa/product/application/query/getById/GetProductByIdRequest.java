package com.cehn17.spring.data.jpa.product.application.query.getById;

import com.cehn17.spring.data.jpa.common.application.mediator.Request;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetProductByIdRequest implements Request<GetProductByIdResponse> {

    private Long id;
}
