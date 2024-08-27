package com.example.managingtraveltours.mapper;

import com.example.managingtraveltours.dao.entity.TourEntity;
import com.example.managingtraveltours.model.request.TourRequest;

public enum TourMapper {
    TOUR_MAPPER;
    public TourEntity buildTourEntity(TourRequest request){
        return TourEntity.builder()
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .startDate(request.getStartDate())
                .endDate(request.getEndDate())
                .build();
    }
}
