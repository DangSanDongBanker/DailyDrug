package com.dailyDrug.Service.ServiceImpl;

import com.dailyDrug.Service.ProductService;
import com.dailyDrug.dto.ProductDto;
import com.dailyDrug.entity.ProductEntity;
import com.dailyDrug.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

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
    public List<ProductDto> getProductList(String productCategory, String productOrder, int pageNo) {

        // Entity타입의 List를 DTO타입의 List로 변환 함 //최신순 정렬
        List<ProductEntity> productEntityList = productRepository.findAllByProductCategoryOrderByRegistrationDate(productCategory);

        return productEntityList.stream()
                .map(ProductDto::new)
                .collect(Collectors.toList());
    };



}
