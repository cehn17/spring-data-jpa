package com.cehn17.spring.data.jpa.review.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryReviewRepository extends JpaRepository<ReviewEntity, Long> {
}
