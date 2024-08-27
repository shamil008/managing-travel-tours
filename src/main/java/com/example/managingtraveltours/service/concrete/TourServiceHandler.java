package com.example.managingtraveltours.service.concrete;

import com.example.managingtraveltours.dao.repository.GuideRepository;
import com.example.managingtraveltours.dao.repository.TourRepository;
import com.example.managingtraveltours.mapper.TourMapper;
import com.example.managingtraveltours.model.request.TourRequest;
import com.example.managingtraveltours.model.response.TourResponse;
import com.example.managingtraveltours.service.abstraction.TourService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.managingtraveltours.mapper.TourMapper.TOUR_MAPPER;

@Service
@RequiredArgsConstructor
public class TourServiceHandler implements TourService {
    private final  TourRepository tourRepository;
    private final GuideRepository guideRepository;
    @Override
    public void createTours(TourRequest request) {

        tourRepository.save(TOUR_MAPPER.buildTourEntity(request));
    }

    @Override
    public void assignGuideToTour(Long tourId, Long guideId) {
        var tour = tourRepository.findById(tourId);
        var guide = guideRepository.findById(guideId);

    }
}
