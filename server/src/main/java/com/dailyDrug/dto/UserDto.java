package com.dailyDrug.dto;

import com.dailyDrug.entity.UserEntity;
import lombok.Data;

@Data
public class UserDto {
    private Integer userCode; //사용자 번호
    private String interestDrug; //관심약
    private String takingDrug; //복용중인 약
    private Integer age; //나이
    private Integer height; //키
    private Integer gender; //성별(0:female, 1:male)
    private Integer weight; //몸무게
    private String name; //이름
    private Integer managerCode; //매니저 코드 (0:고객, 1: 매니저)
    private String email; //이메일
    private String password; //패스워드
    private String birth;

    //repository 를 통해 조회한 entity 를 dto 로 변환 용도
//    public UserDto(UserEntity entity) {
//        this.userCode = entity.getCode();
//        this.interestDrug = entity.getInterestDrug();
//        this.takingDrug = entity.getTakingDrug();
//        this.age = entity.getAge();
//        this.height = entity.getHeight();
//        this.gender = entity.getGender();
//        this.weight = entity.getWeight();
//        this.name = entity.getName();
//        this.managerCode = entity.getManagerCode();
//        this.email = entity.getEmail();
//    }
}
