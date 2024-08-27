package com.example.managingtraveltours.mapper;

import com.example.managingtraveltours.dao.entity.DestinationEntity;
import com.example.managingtraveltours.model.request.DestinationRequest;

public enum DestinationMapper {
    DESTINATION_MAPPER;
    public DestinationEntity buildDestinationEntity(DestinationRequest request){
        return DestinationEntity.builder()
                .location(request.getLocation())
                .description(request.getDescription())
                .visitDate(request.getVisitDate())
                .build();
    }

}
