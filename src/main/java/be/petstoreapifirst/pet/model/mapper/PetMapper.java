package be.petstoreapifirst.pet.model.mapper;

import be.example.petstoreopenapi.rest.model.PetDto;
import be.petstoreapifirst.pet.model.Pet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = {CategoryMapper.class, TagMapper.class})
public interface PetMapper {
    PetMapper INSTANCE = Mappers.getMapper(PetMapper.class);

    Pet toPet(PetDto petDto);

    PetDto toPetDto(Pet pet);
}
