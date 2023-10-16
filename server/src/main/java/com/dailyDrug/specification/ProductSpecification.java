package com.dailyDrug.specification;

import com.dailyDrug.entity.ProductEntity;
import org.springframework.data.jpa.domain.Specification;

public class ProductSpecification {
    public static Specification<ProductEntity> equalProductCategory(String productCategory) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("productCategory"), productCategory);
    }

}
