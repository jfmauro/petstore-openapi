package be.petstoreapifirst.pet.model;

import be.petstoreapifirst.persistence.AbstractEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Tag {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @NotNull(message = "mandatory")
    @Column(name="NAME")
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "PET_ID")
    private Pet pet;

    @Column(insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime creationDate;

    @Version
    @Column(nullable = false, name = "VERSION")
    private Integer version;
}
