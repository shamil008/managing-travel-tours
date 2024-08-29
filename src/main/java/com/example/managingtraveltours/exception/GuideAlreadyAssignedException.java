package com.example.managingtraveltours.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class GuideAlreadyAssignedException extends  RuntimeException{
    private String code;

    public GuideAlreadyAssignedException(String message, String code) {
        super(message);
        this.code = code;
    }
}
