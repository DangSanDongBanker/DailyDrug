package com.dailyDrug.dto;

import lombok.Data;

@Data
public class userDto {
    private String user_code; //사용자 번호
    private String interest_drug; //관심약
    private String taking_drug; //복용중인 약
    private int user_age; //나이
    private int user_height; //키
    private enum user_gender{M, W}; //사용자 성별
    private int user_weight; //사용자 무게
    private String user_name; //사용자 이름
    private enum manager_code{Y, N}; //사용자의 관리자 여부
}
