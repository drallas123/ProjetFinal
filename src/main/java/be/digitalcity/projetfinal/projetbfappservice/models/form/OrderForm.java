package be.digitalcity.projetfinal.projetbfappservice.models.form;

import be.digitalcity.projetfinal.projetbfappservice.models.dto.AddressDTO;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@EqualsAndHashCode
@ToString
@Getter
@Setter
@Validated
public class OrderForm {
    @NotNull
    private LocalDate startTime;
    @NotNull
    private LocalDate endTime;
    @NotNull
    private AddressDTO address;
}
