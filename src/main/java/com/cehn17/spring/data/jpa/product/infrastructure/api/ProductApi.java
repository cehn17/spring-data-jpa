package com.cehn17.spring.data.jpa.product.infrastructure.api;

import com.cehn17.spring.data.jpa.common.domain.PaginationResult;
import com.cehn17.spring.data.jpa.product.infrastructure.api.dto.CreateProductDto;
import com.cehn17.spring.data.jpa.product.infrastructure.api.dto.ProductDto;
import com.cehn17.spring.data.jpa.product.infrastructure.api.dto.UpdateProductDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface ProductApi {

    public ResponseEntity<PaginationResult<ProductDto>> getAllProducts(int pageNumber, int pageSize);

    public ResponseEntity<ProductDto> getProductById(@PathVariable Long id);

    public ResponseEntity<Void> saveProduct (@RequestBody CreateProductDto productDto);

    public ResponseEntity<Void> updateProduct (@RequestBody UpdateProductDto productDto);

    public ResponseEntity<Void> deleteProduct (@PathVariable Long id);

}
