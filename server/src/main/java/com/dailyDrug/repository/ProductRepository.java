package com.dailyDrug.repository;

import com.dailyDrug.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity, String> {
  Optional<ProductEntity> findByProductId(Integer productId);
  List<ProductEntity> findAllByProductName(String productName);




}
