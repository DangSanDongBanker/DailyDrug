package com.dailyDrug.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@NoArgsConstructor
@Entity
@Setter
@Table(name = "product")
public class ProductEntity {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private Integer id; //상품 코드

    @Column(name = "product_name") //db컬럼명과 변수명이 다를 경우 지정하거나 다른 조건(설정)을 할 경우에 사용함.
    private String productName; //상품명

    @Column(name = "product_category")
    private String productCategory; //상품분류

    @Column(name = "interest_drug_count")
    private Integer interestDrugCount; //관심약 숫자

    @Column(name = "detail_nutrient")
    private String detailNutrient; //상세 영양성분

    @Column(name = "registration_date")
    private String registrationDate; //등록 일자

    @Builder //Lombok 프로젝트의 기능 중 하나로, 빌더 패턴을 자동으로 생성(get, set)
    public ProductEntity(Integer productId,String productName, String productCategory, Integer interestDrugCount, String detailNutrient, String registrationDate) {
        this.id = productId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.interestDrugCount = interestDrugCount;
        this.detailNutrient = detailNutrient;
        this.registrationDate = registrationDate;
    }

}
