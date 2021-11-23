package be.digitalcity.projetfinal.projetbfappservice.models.entities;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Client extends User {

    private Set<Order> orderList;

    @Column(nullable = false, unique = true)
    private String paymentMethod;
}
