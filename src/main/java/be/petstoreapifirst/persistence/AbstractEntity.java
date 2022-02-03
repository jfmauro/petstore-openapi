package be.petstoreapifirst.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Class containing the common data of entities.
 */
@MappedSuperclass
public abstract class AbstractEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime creationDate;

    @Version
    @Column(nullable = false, name = "VERSION")
    private Integer version;

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }
}
