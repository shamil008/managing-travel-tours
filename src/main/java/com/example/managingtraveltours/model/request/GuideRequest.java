package com.example.managingtraveltours.model.request;

import com.example.managingtraveltours.dao.entity.PassportEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GuideRequest {
    private String name;
    private String email;
    private String phoneNumber;
    private PassportRequest passportRequest;
}
