package com.cehn17.spring.data.jpa.category.infrastructure;

import com.cehn17.spring.data.jpa.product.infrastructure.database.entity.ProductEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToMany(mappedBy = "categories")
    List<ProductEntity> products;

}
