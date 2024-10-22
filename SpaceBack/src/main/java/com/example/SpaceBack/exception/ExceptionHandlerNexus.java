package com.example.SpaceBack.exception;

import com.example.SpaceBack.dto.ExceptionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.Date;

@ControllerAdvice
public class ExceptionHandlerNexus {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ExceptionDTO> handleConflictException(MethodArgumentNotValidException ex){
        ExceptionDTO exceptionDTO = new ExceptionDTO(ex.getMessage(), ex.getStatusCode().value(), LocalDateTime.now());

        return new ResponseEntity<>(exceptionDTO, ex.getStatusCode());
    }
}
