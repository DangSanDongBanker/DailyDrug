package com.dailyDrug.controller;

import com.dailyDrug.Service.ProductService;
import com.dailyDrug.dto.ProductDto;
import jakarta.annotation.Resource;
import jakarta.servlet.http.HttpServletRequest;
import org.json.JSONException;
import org.springframework.web.bind.annotation.*;
import org.json.JSONObject;

import java.util.List;


@RestController
@RequestMapping("/product")

public class ProductController {

    @Resource
    private ProductService productService;

    /**
     * @method 			페이지, 조건에 따른 제품 목록을 조회하기 위한 메소드
     * @param pageNo 	선택 페이저 ===> 무한 스크롤 조사 필요(큰 차이 없을 듯?)
     * @return 		조건을 만족하는 상품 리스트
     * @throws Exception
     */
    @GetMapping("/productList")
    public String getAllProducts(
            HttpServletRequest request,
            @RequestParam(name = "pageNo", defaultValue = "1") int pageNo) {

        // 검색 중 카테고리 조건
        String productCategory = request.getParameter("productCategory");
        // 정렬 조건
        String productOrder = request.getParameter("productOrder");

        //테스트 중 ///예시
        ProductDto product = new ProductDto();
        List<ProductDto> productList = productService.getProductsList(pageNo, productCategory, productOrder);

        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("productList", productList);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonObject.toString();
    }

    /**
     * @method 			선택 상품의 상세 정보 조회 (영양 성분, 상품명, 가격 등)
     * @param productCode 	선택한 상품의 상품코드
     * @return 		선택 상품의 상세 정보
     * @throws Exception
     */
    @GetMapping("/productCode")
    public String getProduct(@RequestParam(name = "productCode") String productCode){

        List<ProductDto> productDetailInformation = productService.getProductsCode(productCode);
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("productDetailInformation", productDetailInformation);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonObject.toString();
    }

    /**
     * @method 			일일 영양 권장량 조회
     * @param dailyServiceCode 	선택 조회 권장량
     * @return
     * @throws Exception
     */


}

