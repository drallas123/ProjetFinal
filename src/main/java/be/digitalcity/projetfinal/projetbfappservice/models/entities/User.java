package be.digitalcity.projetfinal.projetbfappservice.models.entities;

import be.digitalcity.projetfinal.projetbfappservice.models.entities.Address;
import be.digitalcity.projetfinal.projetbfappservice.models.entities.Group;
import be.digitalcity.projetfinal.projetbfappservice.models.entities.Role;
import be.digitalcity.projetfinal.projetbfappservice.models.entities.abstractClass.BaseEntity;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "app_user")
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User extends BaseEntity<Long> {

    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;

    @OneToMany(targetEntity = Role.class, fetch = FetchType.EAGER)
    private List<Role> roles;

    @ManyToOne(targetEntity = Group.class, fetch = FetchType.EAGER)
    private Group group;

    @ManyToOne(targetEntity = Address.class, cascade = {CascadeType.PERSIST})
    private Address address;

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public void addRoles(List<Role> roles) {
        this.roles.addAll(roles);
    }

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDate.now();
    }

    @PreUpdate
    public void preUpdate() {
        this.updatedAt = LocalDate.now();
    }

    /**
     * Security
     */
    @Column(nullable = false)
    private boolean accountNonExpired;
    @Column(nullable = false)
    private boolean accountNonLocked;
    @Column(nullable = false)
    private boolean creditialsNonExpired;
    @Column(nullable = false)
    private boolean enabled;

    public boolean isAccountNonExpired(){
        return accountNonExpired;
    }
    public boolean isAccountNonLocked(){
        return accountNonLocked;
    }
    public boolean isCredentialsNonExpired(){
        return creditialsNonExpired;
    }
    public boolean isEnabled(){
        return enabled;
    }
}







