package com.cehn17.spring.data.jpa.category.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryCategoryRepository extends JpaRepository<CategoryEntity, Long> {
}
