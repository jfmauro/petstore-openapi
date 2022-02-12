package be.petstoreapifirst.pet.api;

import be.example.petstoreopenapi.rest.api.PetApi;
import be.example.petstoreopenapi.rest.model.PetDto;
import be.petstoreapifirst.pet.exception.PetNotFoundException;
import be.petstoreapifirst.pet.model.Pet;
import be.petstoreapifirst.pet.model.mapper.PetMapper;
import be.petstoreapifirst.pet.service.PetService;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@CrossOrigin
@RestController
@RequiredArgsConstructor
public class PetRestController implements PetApi {

    private final PetService petService;
    private final PetMapper petMapper;

    @Override
    public ResponseEntity<PetDto> addPet(PetDto petDto) {
        final Pet pet = petService.newPet(petMapper.toPet(petDto));
        return new ResponseEntity<>(petMapper.toPetDto(pet), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<PetDto> getPetById(Long petId) {
        final Pet pet = petService.findById(petId)
                .orElseThrow(() -> new PetNotFoundException(petId));
        return new ResponseEntity<>(petMapper.toPetDto(pet), HttpStatus.OK);
    }

}
