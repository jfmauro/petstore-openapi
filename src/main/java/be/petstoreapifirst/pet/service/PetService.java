package be.petstoreapifirst.pet.service;

import be.example.petstoreopenapi.rest.model.PetDto;
import be.petstoreapifirst.pet.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PetService {

    private final PetRepository petRepository;
    private final CategoryRepository categoryRepository;

    @Transactional
    public PetDto newPet(PetDto petDto){
        Optional<Category> categoryOpt = categoryRepository.findById(petDto.getCategory().getId());
        Pet pet = new Pet();
        pet.setName(petDto.getName());
        pet.setCategory(categoryOpt.get());
        String status = petDto.getStatus().getValue();
        pet.setStatus(PetStatus.fromValue(status));
        petRepository.save(pet);
        PetDto dto = new PetDto();
        dto.setId(pet.getId());
        dto.setName(pet.getName());
        return dto;
    }
}
