package com.dailyDrug.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Entity
@Setter
@Table(name = "user")
public class UserEntity {

    @Id
    @Column(name = "code", unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;

    @Column(name = "interest_drug")
    private String interestDrug;

    @Column(name = "taking_drug")
    private String takingDrug;

    @Column(name = "age")
    private Integer age;

    @Column(name = "height")
    private Integer height;

    @Column(name = "gender")
    private Integer gender;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "name")
    private String name;

    @Column(name = "manager_code")
    private Integer managerCode;

    @Column(name = "email", unique = true)
    private String email;

    @Builder //Lombok 프로젝트의 기능 중 하나로, 빌더 패턴을 자동으로 생성(get, set)
    public UserEntity(Integer code,String interestDrug, String takingDrug, Integer age, Integer height, Integer gender,
                      Integer weight, String name, Integer managerCode, String email) {
        this.code = code;
        this.interestDrug = interestDrug;
        this.takingDrug = takingDrug;
        this.age = age;
        this.height = height;
        this.gender = gender;
        this.weight = weight;
        this.name = name;
        this.managerCode = managerCode;
        this.email = email;
    }
}
