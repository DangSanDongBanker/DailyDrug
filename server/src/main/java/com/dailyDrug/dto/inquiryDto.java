package com.dailyDrug.dto;

import lombok.Data;

import java.util.Date;

@Data
public class inquiryDto {
    private String inquiry_id; //문의 번호
    private String inquiry_answer_check; //답변여부
    private Date inquiry_registration_date; //등록일자
    private String inquiry_contents; //문의내용
    private String inquiry_answer_contents; //답변 내용
    private String product_id; //상품코드
    private String user_code; //사용자 번호
}
