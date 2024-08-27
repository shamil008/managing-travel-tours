package com.example.managingtraveltours.controller;

import com.example.managingtraveltours.model.request.TravellerRequest;
import com.example.managingtraveltours.service.abstraction.TravelerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/travellers")
public class TravellerController {
    private final TravelerService travelerService;

    @PostMapping
    @ResponseStatus(CREATED)
    public void createTraveller(@RequestBody TravellerRequest request){
        travelerService.createTraveller(request);
    }
}
