package com.dailyDrug.repository;

import com.dailyDrug.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
  Optional<ProductEntity> findByProductId(Integer productId);

  List<ProductEntity> findAllByProductCategoryOrderByRegistrationDate(String productCategory);


}
//참조 블로그: https://ykh6242.tistory.com/entry/Spring-데이터-JPA-쿼리-메소드-기능