package com.example.managingtraveltours.service.abstraction;

import com.example.managingtraveltours.model.request.TourRequest;
import com.example.managingtraveltours.model.response.TourResponse;

public interface TourService {
     void createTours(TourRequest request);
     void assignGuideToTour(Long tourId,Long guideId);
}
