package com.dailyDrug.dto;

import lombok.Data;

import java.util.Date;

@Data
public class popularityRankDto {
    private Date date; //인기순위 등록일
    private String product_id; //상품코드
    private int rank; //순위
    private int interest_drug_count; //관심약 숫자
}
