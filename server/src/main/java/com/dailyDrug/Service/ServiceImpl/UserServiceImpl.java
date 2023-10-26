package com.dailyDrug.Service.ServiceImpl;

import com.dailyDrug.Service.UserService;
import com.dailyDrug.entity.UserEntity;
import com.dailyDrug.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    final UserRepository userRepository;

    @Override
    public UserEntity getUserInfo(Integer code) {

        UserEntity user = userRepository.findById(code).orElseThrow(()
                -> new IllegalArgumentException("없는 회원 입니다."));

        return user;
    }
}
