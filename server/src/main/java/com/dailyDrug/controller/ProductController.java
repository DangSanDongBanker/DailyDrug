package com.dailyDrug.controller;

import com.dailyDrug.Service.ProductService;
import com.dailyDrug.dto.ProductDto;
import com.dailyDrug.entity.ProductEntity;
import jakarta.annotation.Resource;
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
    public ResponseEntity getProductInformation(@PathVariable("product-id") Integer productId){

        ProductDto productInfo = productService.getProductInfo(productId);

        return new ResponseEntity<>(productInfo, HttpStatus.OK);
    }

    /**
     * 선택 상품 카테고리, 정렬 기준, 오름차순/내림차순, 페이징 넘버, 페이지 개수를 조건으로 하는 상품 리스트들을 검색 할 수 있다.
     * 카테고리를 선택하지 않을 시 전체 상품 카테고리를 대상으로 검색을 하게 됨. 그 외 조건은 기본 값으로 최신순, 내림차순, 페이징 넘버 0, 페이지 개수 5를 가진다.
     * @param productCategory
     * @param productOrder
     * @param sortOrder
     * @param pageNo
     * @param pageSize
     * @return
     */
    @GetMapping
    public ResponseEntity<List> getProductList(@RequestParam(value = "product-category", required = false) String productCategory,
                                 @RequestParam(value = "product-order",defaultValue = "registrationDate", required = false) String productOrder,
                                 @RequestParam(value = "sortOrder",defaultValue = "ASC", required = false) String sortOrder,
                                 @RequestParam(value = "page-no", defaultValue = "0", required = false) int pageNo,
                                 @RequestParam(value = "page-size", defaultValue = "5", required = false) int pageSize){

        List<ProductEntity> productList = productService.getProductList( productCategory,  productOrder, sortOrder,  pageNo,  pageSize);

        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    /**
     * 선택 상품의 관심 횟수를 1증가시킬 수 있다.
     * @param productId
     * @return 선택한 상품의 상세 정보
     */
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

