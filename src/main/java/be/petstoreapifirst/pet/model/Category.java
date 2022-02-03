package be.petstoreapifirst.pet.model;

import be.petstoreapifirst.persistence.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "CATEGORY")
public class Category extends AbstractEntity {

    @NotNull(message = "mandatory")
    @Column(name="NAME")
    private String name;
}
