package com.dailyDrug.dto;

import com.dailyDrug.entity.ProductEntity;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Data

// 상품정보 데이터 dto
public class ProductDto {
    private Integer productId; //상품 코드
    private String productName; //상품명
    private String productCategory; //상품분류
    private int interestDrugCount; //관심약 숫자
    private String detailNutrient; //상세 영양성분
    private LocalDateTime registrationDate; //등록 일자

    //repository 를 통해 조회한 entity 를 dto 로 변환 용도
    public ProductDto(ProductEntity entity) {
        this.productId = entity.getId();
        this.productName = entity.getProductName();
        this.productCategory = entity.getProductCategory();
        this.interestDrugCount = entity.getInterestDrugCount();
        this.detailNutrient = entity.getDetailNutrient();
        this.registrationDate = entity.getRegistrationDate();
    }
}



