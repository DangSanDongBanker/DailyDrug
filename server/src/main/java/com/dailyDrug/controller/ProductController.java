package com.dailyDrug.controller;

import com.dailyDrug.Service.ProductService;
import com.dailyDrug.dto.ProductDto;
import com.dailyDrug.entity.ProductEntity;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Resource;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
            return result;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "JSON Serialization error";
        }
    }

    @GetMapping
    public String getProductList(@RequestParam("product-category") String productCategory,
                                  @RequestParam("product-order") String productOrder,
                                  @RequestParam("page-no") int pageNo,
                                  @RequestParam("page-size") int pageSize){

        //java객체를 json직렬화 하기 위한 Jackson ObjectMapper 생성
        ObjectMapper objectMapper = new ObjectMapper();

        List<ProductDto> productList = productService.getProductList( productCategory,  productOrder,  pageNo,  pageSize);


        try {
            //DTO 객체를 JSON 문자열로 직렬화
            String result = objectMapper.writeValueAsString(productList);
            return result;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "JSON Serialization error";
        }
    }

    @PatchMapping("/{product-id}/interest/increment")
    public ResponseEntity<ProductEntity> incrementProductInterest(@PathVariable("product-id") Integer productId){

        ProductEntity productInterest = productService.incrementProductInterest(productId);

        return new ResponseEntity<>(productInterest, HttpStatus.OK);

    }
}
//참조 블로그, 글, 코드
// api 설계 원칙 참조 블로그: https://velog.io/@couchcoding/개발-초보를-위한-RESTful-API-설계-가이드

//참조 프로젝트
//https://github.com/osopromadze/Spring-Boot-Blog-REST-API/blob/main/src/main/java/com/sopromadze/blogapi/controller/TodoController.java

