package be.digitalcity.projetfinal.projetbfappservice.models.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class OrderDTO {
    private Long id;
    private LocalDate startTime;
    private LocalDate endTime;
    private AddressDTO address;


}
