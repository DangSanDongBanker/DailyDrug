package com.dailyDrug.Service.ServiceImpl;

import com.dailyDrug.Service.ProductService;
import com.dailyDrug.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<ProductDto> getProductsList(int pageNo, String productCategory, String productOrder) {
        List<ProductDto> stringList = (List<ProductDto>) new ProductDto();
        return stringList;
    };

    @Override
    public List<ProductDto> getProductsCode(String productCode) {

        List<ProductDto> stringList = (List<ProductDto>) new ProductDto();

        return stringList;
    }

    @Override
    public List<ProductDto>  getDailyRecommand(String dailyServiceCode) {

        List<ProductDto> stringList = (List<ProductDto>) new ProductDto();

        return stringList;
    }




}
