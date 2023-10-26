package com.dailyDrug.controller;

import com.dailyDrug.Service.UserService;
import com.dailyDrug.entity.UserEntity;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Resource
    private UserService userService;

    //사용자 조회
    @GetMapping("/{user-code}")
    public ResponseEntity getUserInformation(@PathVariable("user-code") Integer userCode){

        UserEntity userInfo = userService.getUserInfo(userCode);

        return new ResponseEntity<>(userInfo, HttpStatus.OK);
    }
}
