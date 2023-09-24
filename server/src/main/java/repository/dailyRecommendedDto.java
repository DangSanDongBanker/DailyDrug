package repository;

import lombok.Data;

@Data
public class dailyRecommendedDto {
    private String daily_service_code; //일일권장량 서비스 코드
    private String recommended_nutrient; //일일권장량
}
