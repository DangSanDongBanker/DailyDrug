package com.dailyDrug.controller;

import com.dailyDrug.Service.InquiryService;
import com.dailyDrug.dto.InquiryDto;
import com.dailyDrug.entity.InquiryEntity;
import com.dailyDrug.entity.UserEntity;
import jakarta.annotation.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/inquiry")
public class InquiryController {

    @Resource
    private InquiryService inquiryService;
    private InquiryDto inquiryDto;

    //문의 조회
    @GetMapping("/{registry-id}")
    public ResponseEntity getInquiryInfo(@PathVariable("registry-id") Integer registryId){

        InquiryEntity inquiryInfo = inquiryService.getInquiryInfo(registryId);

        return new ResponseEntity<>(inquiryInfo, HttpStatus.OK);
    }


}
