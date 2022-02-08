package be.petstoreapifirst.pet.model.mapper;

import be.example.petstoreopenapi.rest.model.CategoryDto;
import be.petstoreapifirst.pet.model.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    Category toCategory(CategoryDto categoryDto);

    CategoryDto toCategoryDto(Category service);
}
