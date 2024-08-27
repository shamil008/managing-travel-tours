package com.example.managingtraveltours.service.concrete;

import com.example.managingtraveltours.dao.repository.DestinationRepository;
import com.example.managingtraveltours.dao.repository.TourRepository;
import com.example.managingtraveltours.mapper.DestinationMapper;
import com.example.managingtraveltours.model.request.DestinationRequest;
import com.example.managingtraveltours.service.abstraction.DestinationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.managingtraveltours.mapper.DestinationMapper.DESTINATION_MAPPER;

@Service
@RequiredArgsConstructor
public class DestinationServiceHandler implements DestinationService {
    private final DestinationRepository destinationRepository;
    private final TourRepository tourRepository;
    @Override
    public void createDestination(DestinationRequest request) {
        var destination = DESTINATION_MAPPER.buildDestinationEntity(request);
        var tour = tourRepository.findById(request.getTourId());
        if(!tour.isEmpty())
            destination.setTour(tour.get());
        destinationRepository.save(destination);

    }
}
