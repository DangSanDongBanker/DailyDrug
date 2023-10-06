package com.dailyDrug.Service;

import com.dailyDrug.dto.dailyRecommendedDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface NutrientService {
    //일일 영양성분 권장량 수정
    public String updateNutrientInformation(String dailyServiceCode);

    //일일 권장량 조회
    public List<dailyRecommendedDto> selectNutrientInformation(String dailyServiceCode);


}
