package com.dailyDrug.repository;

import com.dailyDrug.entity.InquiryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InquiryRepository extends JpaRepository<InquiryEntity, Integer>{
    Optional<InquiryEntity> findByRegistryId(Integer registryId);
}
