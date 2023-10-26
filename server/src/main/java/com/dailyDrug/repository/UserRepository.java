package com.dailyDrug.repository;

import com.dailyDrug.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{
    Optional<UserEntity> findById(Integer code);
}
