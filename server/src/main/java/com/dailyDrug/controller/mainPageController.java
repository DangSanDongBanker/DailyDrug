package com.dailyDrug.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class mainPageController {

    /**
     * @author 전병천
     * @method 			초기 메인페이지에서 상품정보(베스트, 새로 업데이트, 일주일간 좋아요)를 가져오는 리스트
     * @param  	        베스트, 업데이트, 일주일간 좋아요 리스트를 각각 호출하는 필터 정보..?
     * @return 			문자열 형태의 JSON, 제품 정보(이미지, 이름, 코드, 카테고리, ) - 일정 갯수 or 페이징
     */
    @GetMapping("/list")
    public String defaultMain(Model model){
        model.addAttribute("data", "adsfzxcv");
        return "hell";
    }



}
