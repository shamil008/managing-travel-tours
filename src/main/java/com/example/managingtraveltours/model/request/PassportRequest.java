package com.example.managingtraveltours.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PassportRequest {
    private String passportNumber;

    private Date issueDate;

    private Date expiryDate;

    private String country;
}
