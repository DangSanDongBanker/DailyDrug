package repository;

import lombok.Data;

@Data

// 상품정보 데이터 dto
public class productDto {
    private String product_id; //상품 코드
    private String product_name; //상품명
    private String product_category; //상품분류
    private int interest_drug_count; //관심약 숫자
    private String detail_nutrient; //상세 영양성분
    private String inquiry_id; //문의 번호
}



