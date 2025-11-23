package com.cehn17.spring.data.jpa.product.infrastructure.database;

import com.cehn17.spring.data.jpa.common.domain.PaginationQuery;
import com.cehn17.spring.data.jpa.common.domain.PaginationResult;
import com.cehn17.spring.data.jpa.product.domain.entity.Product;
import com.cehn17.spring.data.jpa.product.domain.port.ProductRepository;
import com.cehn17.spring.data.jpa.product.infrastructure.database.entity.ProductEntity;
import com.cehn17.spring.data.jpa.product.infrastructure.database.mapper.ProductEntityMapper;
import com.cehn17.spring.data.jpa.product.infrastructure.database.repository.QueryProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
@Slf4j
@Primary
public class ProductRepositoryImpl implements ProductRepository {

    private final QueryProductRepository repository;

    private final ProductEntityMapper productEntityMapper;

    @Override
    public Product upsert(Product product) {
        ProductEntity productEntity = productEntityMapper.mapToProductEntity(product);
        repository.save(productEntity);
        return productEntityMapper.mapToProduct(productEntity);
    }

    //@Cacheable(value = "products", key = "#id")
    @Override
    public Optional<Product> findById(Long id) {
        log.info("Finding product by id {}", id);
        return repository.findById(id).map(productEntityMapper::mapToProduct);
    }

    @Override
    public PaginationResult<Product> findAll(PaginationQuery paginationQuery) {
        PageRequest pageRequest = PageRequest.of(paginationQuery.getPage(), paginationQuery.getSize());

        Page<ProductEntity> page = repository.findAll(pageRequest);

        return new PaginationResult<>(
                page.getContent().stream().map(productEntityMapper::mapToProduct).toList(),
                page.getNumber(),
                page.getSize(),
                page.getTotalPages(),
                page.getTotalElements()
        );
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
