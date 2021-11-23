package be.digitalcity.projetfinal.projetbfappservice.models.entities;

import be.digitalcity.projetfinal.projetbfappservice.models.entities.abstractClass.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@EqualsAndHashCode(callSuper = true)
@Entity
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
    @ManyToOne(targetEntity = OrderAddress.class)
    private OrderAddress orderAddress;
    @ManyToOne(targetEntity = User.class)
    private User orderUser;

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDate.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDate.now();
    }

}
