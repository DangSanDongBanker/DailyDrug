package com.dailyDrug.repository;

import com.dailyDrug.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer>, JpaSpecificationExecutor<ProductEntity> {
  Optional<ProductEntity> findById(Integer id);

  Page<ProductEntity> findAll(Specification<ProductEntity> spec, Pageable pageable);

}
//참조 블로그: https://ykh6242.tistory.com/entry/Spring-데이터-JPA-쿼리-메소드-기능