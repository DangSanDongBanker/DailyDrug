package com.dailyDrug.Service.ServiceImpl;

import com.dailyDrug.Service.ProductService;
import com.dailyDrug.dto.ProductDto;
import com.dailyDrug.entity.ProductEntity;
import com.dailyDrug.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    final ProductRepository productRepository;

    @Override
    public ProductDto getProductInfo(Integer productId) {

        ProductEntity product = productRepository.findByProductId(productId).orElseThrow(()
                -> new IllegalArgumentException("해당 게시물이 존재하지 않습니다."));

        return new ProductDto(product);
    }

    @Override
    public List<ProductEntity> getProductsList(int pageNo, String productCategory, String productOrder) {

        List<ProductEntity> productEntityList = productRepository.findAllByProductName(productOrder);
        // Entity타입의 List를 DTO타입의 List로 변환 해야 함

        return productEntityList;

    };



}
