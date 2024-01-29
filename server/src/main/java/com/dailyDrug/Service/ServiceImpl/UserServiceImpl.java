package com.dailyDrug.Service.ServiceImpl;

import com.dailyDrug.Service.UserService;
import com.dailyDrug.dto.UserDto;
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

        UserEntity user = userRepository.findByCode(code).orElseThrow(()
                -> new IllegalArgumentException("없는 회원 입니다."));

        return user;
    }

    @Override
    public UserEntity createUserInfo(UserDto userDto) {

        UserEntity user = new UserEntity();
        //user.setCode(2);
        user.setAge(userDto.getAge());
        user.setHeight(userDto.getHeight());
        user.setWeight(userDto.getWeight());
        user.setEmail(userDto.getEmail());
        //이미 있는 회원/이메일은 중복 불가 처리해야 함 //우선은 생성만.


        return userRepository.save(user);
    }
}
