package be.petstoreapifirst.pet.api;

import be.example.petstoreopenapi.rest.api.PetApi;
import be.example.petstoreopenapi.rest.model.PetDto;
import be.petstoreapifirst.pet.service.PetService;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class PetRestController implements PetApi {

    private final PetService petService;

    @Override
    public ResponseEntity<PetDto> addPet(PetDto petDto) {
        petService.newPet(petDto);
        return new ResponseEntity<>(petDto, HttpStatus.CREATED);
    }
}
