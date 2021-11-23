package be.digitalcity.projetfinal.projetbfappservice.models.form.userForm;


import be.digitalcity.projetfinal.projetbfappservice.models.entities.Address;
import be.digitalcity.projetfinal.projetbfappservice.models.entities.Group;
import be.digitalcity.projetfinal.projetbfappservice.models.entities.Role;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotNull;
import java.util.List;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@Validated
public class UserUpdateForm {
    @Length(min = 5, max = 60)
    @NotNull
    private String username;
    @NotNull
    private String email;
    @NotNull
    private Address address;
    @Length(min = 6)
    @NotNull
    private String password;
    @NotNull
    private List<Role> roles;
    @NotNull
    private Group group;

}
