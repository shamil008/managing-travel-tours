package com.example.managingtraveltours.service.concrete;

import com.example.managingtraveltours.dao.repository.TravellerRepository;
import com.example.managingtraveltours.mapper.TravellerMapper;
import com.example.managingtraveltours.model.request.TravellerRequest;
import com.example.managingtraveltours.service.abstraction.TravelerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.example.managingtraveltours.mapper.TravellerMapper.TRAVELLER_MAPPER;

@Service
@RequiredArgsConstructor
public class TravellerServiceHandler implements TravelerService {
    private final TravellerRepository travellerRepository;
    @Override
    public void createTraveller(TravellerRequest request) {
        travellerRepository.save(TRAVELLER_MAPPER.buildTravellerEntity(request));
    }
}
