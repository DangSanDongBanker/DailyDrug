package com.dailyDrug.Service;
import com.dailyDrug.dto.ProductDto;
import com.dailyDrug.entity.ProductEntity;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Transactional
public interface ProductService {

    ProductDto getProductInfo(Integer productId);
    List<ProductEntity> getProductsList(int pageNo, String productCategory, String productOrder);






}
