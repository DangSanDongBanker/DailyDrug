package com.dailyDrug.Service;
import com.dailyDrug.dto.ProductDto;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
public interface ProductService {

    List<ProductDto> getProductsList(int pageNo, String productCategory, String productOrder);
    List<ProductDto> getProductsCode(String productCode);
    List<ProductDto> getDailyRecommand(String dailyServiceCode);


}
