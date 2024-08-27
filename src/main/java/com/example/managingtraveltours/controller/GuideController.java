package com.example.managingtraveltours.controller;

import com.example.managingtraveltours.model.request.GuideRequest;
import com.example.managingtraveltours.service.abstraction.GuideService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/guides")
public class GuideController {
    private final GuideService guideService;
    @PostMapping
    @ResponseStatus(CREATED)
    public void createGuide(@RequestBody GuideRequest request){
        guideService.createGuide(request);
    }
}
