package com.example.managingtraveltours.controller;

import com.example.managingtraveltours.model.request.TourRequest;
import com.example.managingtraveltours.service.abstraction.TourService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;
import static org.springframework.http.HttpStatus.NO_CONTENT;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/tours")
public class TourController {
    private final TourService tourService;


    @PostMapping
    @ResponseStatus(CREATED)
    public void createTour(@RequestBody TourRequest request){
        tourService.createTours(request);
    }

}
