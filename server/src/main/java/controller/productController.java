package controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class productController {


    //인기순, 추천순 등의 정렬은 매번 연결을 할지 필터 터리를 할지는 고민 필요
    /**
     * @author 전병천
     * @method 		    상품 리스트 조회
     * @param  	        필터(인기순,  정보)
     * @return 			문자열 형태의 JSON, 제품 정보(이미지, 이름, 코드, 카테고리, ), 페이징..? (무한 스크롤 백은 어떻게 이루어지는 조사 필요)
     //상품 카테고리는 하드 코딩으로.
     */
    @GetMapping("/list")
    public List<product> productList(@RequestParam(defaultValue="1") int pageNo, @RequestParam int pageSize, @RequestParam String product_category){
        List<product> products = new ArrayList();
        return products;
    }

    /**
     * @author 전병천
     * @method 		    상품 상세 정보 조회
     * @param  	        선택한 상품의 코드와 일일권장량 필터
     * @return 			문자열 형태의 JSON, 제품 정보(이미지, 이름, 코드, 카테고리, ), 일일권장량
    //상품 카테고리는 하드 코딩으로.
     */
    @GetMapping("/detailProduct")
    public List<product> detailProduct (@RequestParam String product_code, @RequestParam(defaultValue="1")  String daily_service_code  ){

        return detailProduct;
    }


}
