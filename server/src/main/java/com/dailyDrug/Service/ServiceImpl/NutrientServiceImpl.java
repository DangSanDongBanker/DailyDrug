package com.dailyDrug.Service.ServiceImpl;

import com.dailyDrug.Service.NutrientService;
import com.dailyDrug.dto.ProductDto;
import com.dailyDrug.dto.dailyRecommendedDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NutrientServiceImpl implements NutrientService {

    @Override
    public String updateNutrientInformation(String dailyServiceCode) {
        String serviceTest = "service";
        return serviceTest;
    };

    @Override
    public List<dailyRecommendedDto> selectNutrientInformation(String dailyServiceCode){
        List<dailyRecommendedDto> result = null;
        return result;
    };


}
