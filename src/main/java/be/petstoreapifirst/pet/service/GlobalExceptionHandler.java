package be.petstoreapifirst.pet.service;

import be.petstoreapifirst.pet.exception.CategoryNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

    //makes Spring return the same HTTP status that you received
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(CategoryNotFoundException.class)
    public String handleFeignStatusException(CategoryNotFoundException e, HttpServletResponse response) {
        //response.setStatus(e.status());
        return e.getMessage();
    }

}
