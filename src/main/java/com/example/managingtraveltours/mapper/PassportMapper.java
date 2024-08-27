package com.example.managingtraveltours.mapper;

import com.example.managingtraveltours.dao.entity.PassportEntity;
import com.example.managingtraveltours.model.request.PassportRequest;

public enum PassportMapper {
    PASSPORT_MAPPER;
    public PassportEntity buildPassportEntity(PassportRequest request){
        return PassportEntity.builder()
                .passportNumber(request.getPassportNumber())
                .issueDate(request.getIssueDate())
                .expiryDate(request.getExpiryDate())
                .country(request.getCountry())
                .build();
    }
}
