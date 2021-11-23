package be.digitalcity.projetfinal.projetbfappservice.models.form.userForm;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@Validated
public class UserLoginForm {
    @NotNull
    private String username;
    @NotNull
    private String password;
}
