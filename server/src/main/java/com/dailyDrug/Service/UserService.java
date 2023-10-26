package com.dailyDrug.Service;

import com.dailyDrug.entity.UserEntity;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface UserService {
    UserEntity getUserInfo(Integer code);
}
