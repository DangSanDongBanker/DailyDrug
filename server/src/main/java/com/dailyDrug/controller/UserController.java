package com.dailyDrug.controller;

import com.dailyDrug.Service.UserService;
import com.dailyDrug.dto.ProductDto;
import com.dailyDrug.dto.UserDto;
import com.dailyDrug.entity.UserEntity;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserService userService;
    private UserDto userDto;

    //사용자 조회
    @GetMapping("/{user-code}")
    public ResponseEntity getUserInformation(@PathVariable("user-code") Integer userCode){

        UserEntity userInfo = userService.getUserInfo(userCode);

        return new ResponseEntity<>(userInfo, HttpStatus.OK);
    }

    @PostMapping("/signup")
    public ResponseEntity createUserInformation(@RequestBody UserDto userDto){

        LocalDate birthDate = LocalDate.parse(userDto.getBirth(), DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        LocalDate currentDate = LocalDate.now();
        // 나이 계산 //두 날짜 사이의 간격을 표현
        Period age = Period.between(birthDate, currentDate);

        int years = age.getYears();
        userDto.setAge(years);

        UserEntity createUserResult = userService.createUserInfo(userDto);

        return new ResponseEntity<>(createUserResult, HttpStatus.OK);
    }
}
