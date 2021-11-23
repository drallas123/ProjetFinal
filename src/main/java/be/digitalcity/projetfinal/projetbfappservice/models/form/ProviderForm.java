package be.digitalcity.projetfinal.projetbfappservice.models.form;

import be.digitalcity.projetfinal.projetbfappservice.models.dto.ServiceDTO;
import be.digitalcity.projetfinal.projetbfappservice.models.dto.UserDTO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.List;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@Validated
public class ProviderForm {
    @NotNull
    private UserDTO user;
    @NotNull
    private List<ServiceDTO> services;
}
