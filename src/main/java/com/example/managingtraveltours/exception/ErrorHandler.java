package com.example.managingtraveltours.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.example.managingtraveltours.model.enums.ExceptionConstants.UNEXPECTED_EXCEPTION;
import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
public class ErrorHandler {
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(INTERNAL_SERVER_ERROR)
//    public ErrorResponse handle(Exception ex){
//        return new ErrorResponse(UNEXPECTED_EXCEPTION.getCode(),UNEXPECTED_EXCEPTION.getMessage());
//    }
    @ExceptionHandler(NotFoundException.class)
    @ResponseStatus(NOT_FOUND)
    public ErrorResponse handle(NotFoundException ex){
        return new ErrorResponse(ex.getCode(),ex.getMessage());
    }

    @ExceptionHandler(GuideAlreadyAssignedException.class)
    @ResponseStatus(BAD_REQUEST)
    public ErrorResponse handle(GuideAlreadyAssignedException ex){
        return new ErrorResponse(ex.getCode(), ex.getMessage());
    }
}
