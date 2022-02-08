package be.petstoreapifirst.pet.model.mapper;

import be.example.petstoreopenapi.rest.model.TagDto;
import be.petstoreapifirst.pet.model.Tag;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TagMapper {
    TagMapper INSTANCE = Mappers.getMapper(TagMapper.class);

    Tag toTag(TagDto tagDto);

    TagDto toTagDto(Tag tag);
}
