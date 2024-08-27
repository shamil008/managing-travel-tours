package com.example.managingtraveltours.service.concrete;

import com.example.managingtraveltours.dao.repository.GuideRepository;
import com.example.managingtraveltours.model.request.GuideRequest;
import com.example.managingtraveltours.service.abstraction.GuideService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.example.managingtraveltours.mapper.GuideMapper.GUIDE_MAPPER;
import static com.example.managingtraveltours.mapper.PassportMapper.PASSPORT_MAPPER;

@Service
@RequiredArgsConstructor
public class GuideServiceHandler implements GuideService {
    private final GuideRepository guideRepository;
    @Override
    @Transactional
    public void createGuide(GuideRequest request) {
        var guide = GUIDE_MAPPER.buildGuideEntity(request);
        var passport = PASSPORT_MAPPER.buildPassportEntity(request.getPassportRequest());
        passport.setGuide(guide);
        guide.setPassport(passport);
        guideRepository.save(guide);
    }
}
