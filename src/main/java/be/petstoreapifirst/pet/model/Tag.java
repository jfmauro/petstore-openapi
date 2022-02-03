package be.petstoreapifirst.pet.model;

import be.petstoreapifirst.persistence.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Tag extends AbstractEntity {

    @NotNull(message = "mandatory")
    @Column(name="NAME")
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "PET_ID")
    private Pet pet;
}
