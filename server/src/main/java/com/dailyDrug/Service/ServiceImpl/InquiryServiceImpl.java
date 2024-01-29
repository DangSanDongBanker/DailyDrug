package com.dailyDrug.Service.ServiceImpl;

import com.dailyDrug.Service.InquiryService;
import com.dailyDrug.Service.UserService;
import com.dailyDrug.dto.InquiryDto;
import com.dailyDrug.dto.UserDto;
import com.dailyDrug.entity.InquiryEntity;
import com.dailyDrug.entity.ProductEntity;
import com.dailyDrug.entity.UserEntity;
import com.dailyDrug.repository.InquiryRepository;
import com.dailyDrug.repository.ProductRepository;
import com.dailyDrug.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InquiryServiceImpl implements InquiryService {
    final InquiryRepository inquiryRepository;
    final ProductRepository productRepository;
    final UserRepository userRepository;

    @Override
    public InquiryEntity getInquiryInfo(Integer registryId) {

        InquiryEntity inquiry = inquiryRepository.findByRegistryId(registryId).orElseThrow(()
                -> new IllegalArgumentException("없는 문의 입니다."));

        return inquiry;
    }



    @Override
    public InquiryEntity registryInquiry(InquiryDto inquiryDto) {

        InquiryEntity inquiry = new InquiryEntity();
        Integer productId = inquiryDto.getProductId();
        Integer userCode = inquiryDto.getUserCode();

        ProductEntity product = productRepository.findById(productId).orElseThrow(()
                -> new IllegalArgumentException("상품이 없습니다."));
        UserEntity user = userRepository.findByCode(userCode).orElseThrow(()
                -> new IllegalArgumentException("없는 회원 입니다."));


        inquiry.setAnswerCheck(inquiryDto.getAnswerCheck()); //확인 작업 필요함. - 코드 추가 해야 함.
        inquiry.setContents(inquiryDto.getContents());
        inquiry.setProductId(product);
        inquiry.setUserCode(user);
        return inquiryRepository.save(inquiry);
    }




}
