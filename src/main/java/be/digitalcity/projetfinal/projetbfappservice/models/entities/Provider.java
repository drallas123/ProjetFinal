package be.digitalcity.projetfinal.projetbfappservice.models.entities;
import be.digitalcity.projetfinal.projetbfappservice.models.entities.abstractClass.User;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "app_provider")
public class Provider extends User {

    @OneToMany(targetEntity = Service.class)
    private Set<Service> serviceList;

    @Column(nullable = false, unique = true)
    private String bankAccount;
}

