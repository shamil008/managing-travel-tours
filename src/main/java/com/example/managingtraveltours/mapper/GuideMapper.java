package com.example.managingtraveltours.mapper;

import com.example.managingtraveltours.dao.entity.GuideEntity;
import com.example.managingtraveltours.model.request.GuideRequest;

public enum GuideMapper {
    GUIDE_MAPPER;
    public GuideEntity buildGuideEntity(GuideRequest request){
        return GuideEntity.builder()
                .name(request.getName())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .build();
    }
}
