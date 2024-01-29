package com.dailyDrug.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InquiryDto {
    private Integer registryId; //문의 번호
    private Integer productId; //상품코드
    private Integer userCode; //사용자번호
    private Integer answerCheck; //답변여부
    private LocalDateTime registrationDate; //등록 일자
    private String contents; //문의 내용
    private String answerContents;//답변내용
}
