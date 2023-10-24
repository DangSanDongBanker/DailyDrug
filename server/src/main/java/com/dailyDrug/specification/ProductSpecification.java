package com.dailyDrug.specification;

import com.dailyDrug.entity.ProductEntity;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ProductSpecification {
    public static Specification<ProductEntity> equalProductCategory(String productCategory) {
        return (root, query, criteriaBuilder) -> criteriaBuilder.equal(root.get("productCategory"), productCategory);
    }

    public static Specification<ProductEntity> betweenCurrentWeek() {
        LocalDateTime startDatetime = LocalDateTime.of(LocalDate.now().minusDays(7), LocalTime.of(0, 0, 0));
        LocalDateTime endDatetime = LocalDateTime.of(LocalDate.now(), LocalTime.of(23, 59, 59));

        return (root, query, criteriaBuilder) ->
                criteriaBuilder.between(root.get("registrationDate"), startDatetime, endDatetime);

    }
}
