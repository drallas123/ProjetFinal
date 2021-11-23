package be.digitalcity.projetfinal.projetbfappservice.models.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class ProviderDTO {
    private Long id;
    private UserDTO user;
    private List<ServiceDTO> services;

}
