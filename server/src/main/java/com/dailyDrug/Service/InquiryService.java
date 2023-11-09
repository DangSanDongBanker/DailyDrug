package com.dailyDrug.Service;

import com.dailyDrug.entity.InquiryEntity;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface InquiryService {
    InquiryEntity getInquiryInfo(Integer registryId);

}
