package com.dailyDrug.Service;

import com.dailyDrug.dto.InquiryDto;
import com.dailyDrug.entity.InquiryEntity;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface InquiryService {
    InquiryEntity getInquiryInfo(Integer registryId);
    InquiryEntity registryInquiry(InquiryDto inquiryDto);

}
