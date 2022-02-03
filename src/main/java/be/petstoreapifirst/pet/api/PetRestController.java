package be.petstoreapifirst.pet.api;

import be.example.petstoreopenapi.rest.api.PetApi;
import be.example.petstoreopenapi.rest.model.PetDto;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@CrossOrigin
@RestController
public class PetRestController implements PetApi {

    @Override
    public ResponseEntity<Void> addPet(@ApiParam(value = "Pet object that needs to be added to the store" ,required=true )
                                           @Valid @RequestBody PetDto petDto) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }
}
