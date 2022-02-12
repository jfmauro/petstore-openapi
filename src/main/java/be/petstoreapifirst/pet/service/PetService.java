package be.petstoreapifirst.pet.service;

import be.example.petstoreopenapi.rest.model.PetDto;
import be.petstoreapifirst.pet.exception.CategoryNotFoundException;
import be.petstoreapifirst.pet.exception.PetNotFoundException;
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
    public Pet newPet(Pet pet){
        Category category = findCategoryById(pet.getCategory().getId());
        pet.setCategory(category);
        pet = petRepository.save(pet);
        return pet;
    }

    public Optional<Pet> findById(Long id) {
        return petRepository.findById(id);
    }

    private Category findCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new CategoryNotFoundException("Category ID : " + id + " not exists"));
    }

}
