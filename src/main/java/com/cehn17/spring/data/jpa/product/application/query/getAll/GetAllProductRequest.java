package com.cehn17.spring.data.jpa.product.application.query.getAll;

import com.cehn17.spring.data.jpa.common.application.mediator.Request;
import com.cehn17.spring.data.jpa.common.domain.PaginationQuery;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetAllProductRequest implements Request<GetAllProductResponse> {
    PaginationQuery paginationQuery;
}
