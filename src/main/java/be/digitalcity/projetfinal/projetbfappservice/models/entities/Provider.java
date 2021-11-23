package be.digitalcity.projetfinal.projetbfappservice.models.entities;
import lombok.*;

import javax.persistence.Column;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Provider extends User {

    private Set<Service> serviceList;

    @Column(nullable = false, unique = true)
    private String bankAccount;
}

