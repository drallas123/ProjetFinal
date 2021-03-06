package be.digitalcity.projetfinal.projetbfappservice.models.entities;

import be.digitalcity.projetfinal.projetbfappservice.models.entities.abstractClass.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "app_address")
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address extends BaseEntity<Long> {
    @Column(nullable = false, unique = true)
    private String street;
    @Column(nullable = false, unique = true)
    private String number;
    @Column(nullable = false, unique = true)
    private String postCode;
    @Column(nullable = false, unique = true)
    private String city;
    @Column(nullable = false, unique = true)
    private String country;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDate.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDate.now();
    }
}
