package be.digitalcity.projetfinal.projetbfappservice.models.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class AddressDTO {
    private Long id;
    private String street;
    private String number;
    private String postCode;
    private String city;
    private String country;
}
