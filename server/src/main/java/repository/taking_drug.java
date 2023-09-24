package repository;

import lombok.Data;

@Data
public class taking_drug { //복용중인 약
    private String product_id; //상품코드
    private String user_code; //사용자 번호
}
