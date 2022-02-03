package be.petstoreapifirst.pet.model;


import be.petstoreapifirst.persistence.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Pet extends AbstractEntity {

    @NotNull(message = "mandatory")
    @Column(name="NAME")
    private String name;

    @NotNull(message = "mandatory")
    @OneToOne
    @JoinColumn(name = "CATEGORY_ID")
    private Category category;

    @Column(name="PHOTO_URLS")
    @Convert(converter = ListToStringConverter.class)
    private List<String> photoUrls = new ArrayList<>();

    @OneToMany(mappedBy = "pet", fetch = FetchType.LAZY)
    private List<Tag> tags = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    @Column(name = "STATUS")
    private PetStatus status;

}
