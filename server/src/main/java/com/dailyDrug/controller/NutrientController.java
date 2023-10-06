package com.dailyDrug.controller;

import com.dailyDrug.Service.NutrientService;
import com.dailyDrug.dto.dailyRecommendedDto;
import jakarta.annotation.Resource;
import
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nutrient")
public class NutrientController {

    @Resource
    private NutrientService nutrientService;

    //권장 영양 성분 수정
    //return: 성공여부...?
    @PatchMapping("/update")
    public String getAllProducts(@RequestParam(name = "daily_service_code") String dailyServiceCode) {
        String updateResult = nutrientService.updateNutrientInformation(dailyServiceCode);
        return updateResult;
    }

    //일일권장량 조회
    @GetMapping("/daily-recommend")
    public List<dailyRecommendedDto> getDailyRecommand(@RequestParam(name = "dailyServiceCode") String dailyServiceCode){

        List<dailyRecommendedDto> list = nutrientService.selectNutrientInformation(dailyServiceCode);

        return list;
    }
}
