package com.example.managingtraveltours.model.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
public enum ExceptionConstants {
    TOUR_NOT_FOUND_EXCEPTION("TOUR_NOT_FOUND","Tour not found."),
    GUIDE_NOT_FOUND_EXCEPTION("GUIDE_NOT_FOUND","Guide not found"),
    GUIDE_ALREADY_ASSIGNED_EXCEPTION("GUIDE_ALREADY_ASSIGNED","Guide assigned other tour"),
    UNEXPECTED_EXCEPTION("UNEXPECTED_EXCEPTION","Unexpected exception occurred");

    private String code;
    private String message;
}
