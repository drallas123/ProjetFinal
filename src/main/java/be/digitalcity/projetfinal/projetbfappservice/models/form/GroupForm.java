package be.digitalcity.projetfinal.projetbfappservice.models.form;


import be.digitalcity.projetfinal.projetbfappservice.models.entities.Role;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.Set;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@Validated
public class GroupForm {
    @NotNull
    private String name;
    @NotNull
    private Set<Role> roleList;
}
