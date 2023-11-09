package com.dailyDrug.Service.ServiceImpl;

import com.dailyDrug.Service.InquiryService;
import com.dailyDrug.Service.UserService;
import com.dailyDrug.dto.UserDto;
import com.dailyDrug.entity.InquiryEntity;
import com.dailyDrug.entity.UserEntity;
import com.dailyDrug.repository.InquiryRepository;
import com.dailyDrug.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InquiryServiceImpl implements InquiryService {
    final InquiryRepository inquiryRepository;

    @Override
    public InquiryEntity getInquiryInfo(Integer registryId) {

        InquiryEntity inquiry = inquiryRepository.findByRegistryId(registryId).orElseThrow(()
                -> new IllegalArgumentException("없는 문의 입니다."));

        return inquiry;
    }


}
