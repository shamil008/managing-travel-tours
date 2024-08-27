package com.example.managingtraveltours.mapper;

import com.example.managingtraveltours.dao.entity.TravellerEntity;
import com.example.managingtraveltours.model.request.TravellerRequest;

public enum TravellerMapper {
    TRAVELLER_MAPPER;
    public TravellerEntity buildTravellerEntity(TravellerRequest request){
        return TravellerEntity.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .build();
    }

}
