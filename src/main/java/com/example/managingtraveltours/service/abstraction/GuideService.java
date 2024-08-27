package com.example.managingtraveltours.service.abstraction;

import com.example.managingtraveltours.dao.repository.GuideRepository;
import com.example.managingtraveltours.model.request.GuideRequest;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;



public interface GuideService {

    void createGuide(GuideRequest request);
}
