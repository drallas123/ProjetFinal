package be.digitalcity.projetfinal.projetbfappservice.models.entities;

import be.digitalcity.projetfinal.projetbfappservice.models.entities.abstractClass.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "app_order")
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order extends BaseEntity<Long> {
    @Column(nullable = false)
    private LocalDate startTime;
    @Column(nullable = false)
    private LocalDate endTime;
    @OneToOne(targetEntity = Address.class)
    private Address orderAddress;
    @ManyToOne(targetEntity = Client.class)
    private Client orderClient;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDate.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDate.now();
    }

}
