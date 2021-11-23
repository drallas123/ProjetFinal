package be.digitalcity.projetfinal.projetbfappservice.models.form;

import be.digitalcity.projetfinal.projetbfappservice.models.dto.OrderDTO;
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
public class ClientForm {
    @NotNull
    private UserDTO user;
    @NotNull
    private List<OrderDTO> orders;
}
