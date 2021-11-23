package be.digitalcity.projetfinal.projetbfappservice.models.form.userForm;

import be.digitalcity.projetfinal.projetbfappservice.models.entities.Address;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@Validated
public class UserRegisterForm {
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

}
