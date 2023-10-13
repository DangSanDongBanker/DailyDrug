package com.dailyDrug.controller;

import com.dailyDrug.Service.ProductService;
import com.dailyDrug.dto.ProductDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import jakarta.annotation.Resource;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")

public class ProductController {

    @Resource
    private ProductService productService;


    @GetMapping("/{product-id}")

    //선택한 상품과 관련 된 추가 기능을 대비하여 @PathVariable 사용.
    public String getProductInformation(@PathVariable("product-id") Integer productId){
        //java객체를 json직렬화 하기 위한 Jackson ObjectMapper 생성
        ObjectMapper objectMapper = new ObjectMapper();

        ProductDto productInfo = productService.getProductInfo(productId);

        try {
            //DTO 객체를 JSON 문자열로 직렬화
            String result = objectMapper.writeValueAsString(productInfo);

            // 결과 JSON을 새로운 JSON 객체로 래핑 //뭔가 뭔가임... 수정 예정.
            ObjectNode resultNode = objectMapper.createObjectNode();
            resultNode.set("result", objectMapper.readTree(result));

            return resultNode.toString();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "JSON Serialization error";
        }
    }
}


//참조 블로그, 글, 코드
// api 설계 원칙 참조 블로그: https://velog.io/@couchcoding/개발-초보를-위한-RESTful-API-설계-가이드

