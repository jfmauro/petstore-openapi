package be.petstoreapifirst.pet.api;

import be.petstoreapifirst.pet.exception.CategoryNotFoundException;
import be.petstoreapifirst.pet.exception.PetNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class PetExceptionHandler {

    //makes Spring return the same HTTP status that you received
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(CategoryNotFoundException.class)
    public String handleCategoryNotFound(CategoryNotFoundException e, HttpServletResponse response) {
        //response.setStatus(e.status());
        return e.getMessage();
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(PetNotFoundException.class)
    public String handlePetNotFound(PetNotFoundException e, HttpServletResponse response) {
        return e.getMessage();
    }

}
