package com.example.managingtraveltours.service.concrete;

import com.example.managingtraveltours.dao.entity.TourEntity;
import com.example.managingtraveltours.dao.repository.GuideRepository;
import com.example.managingtraveltours.dao.repository.TourRepository;
import com.example.managingtraveltours.exception.GuideAlreadyAssignedException;
import com.example.managingtraveltours.exception.NotFoundException;
import com.example.managingtraveltours.mapper.TourMapper;
import com.example.managingtraveltours.model.enums.ExceptionConstants;
import com.example.managingtraveltours.model.request.TourRequest;
import com.example.managingtraveltours.model.response.TourResponse;
import com.example.managingtraveltours.service.abstraction.TourService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;

import static com.example.managingtraveltours.mapper.TourMapper.TOUR_MAPPER;
import static com.example.managingtraveltours.model.enums.ExceptionConstants.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class TourServiceHandler implements TourService {
    private final  TourRepository tourRepository;
    private final GuideRepository guideRepository;
    @Override
    public void createTours(TourRequest request) {

        tourRepository.save(TOUR_MAPPER.buildTourEntity(request));
    }

    @Override
    public void assignGuideToTour(Long tourId, Long guideId) {
        var tour = tourRepository.findById(tourId).orElseThrow(()-> new NotFoundException(TOUR_NOT_FOUND_EXCEPTION.getCode(),TOUR_NOT_FOUND_EXCEPTION.getMessage()));
        var guide = guideRepository.findById(guideId).orElseThrow(()-> new NotFoundException(GUIDE_NOT_FOUND_EXCEPTION.getCode(),GUIDE_NOT_FOUND_EXCEPTION.getMessage()));
    for(var existingTours : guide.getTours()){
        if(checkTravelDates(tour.getStartDate(),tour.getEndDate(),existingTours.getStartDate(),existingTours.getEndDate()))
            throw new GuideAlreadyAssignedException(GUIDE_ALREADY_ASSIGNED_EXCEPTION.getCode(), GUIDE_ALREADY_ASSIGNED_EXCEPTION.getMessage());
    }

        tour.getGuides().add(guide);
        tourRepository.save(tour);
    }
    private boolean checkTravelDates(Date start1, Date end1, Date start2, Date end2){
        return start1.before(end2) && start2.before(end1);

    }

}
