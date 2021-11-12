package com.example.examen.configuration;

import com.example.examen.controller.PrestamoInexistenteException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class ExceptionPrestamoHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ PrestamoInexistenteException.class })
    protected ResponseEntity<Object> handleNotFound(
            Exception ex, WebRequest request) {
        return handleExceptionInternal(ex, "Prestamo not found",
                new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }

}
