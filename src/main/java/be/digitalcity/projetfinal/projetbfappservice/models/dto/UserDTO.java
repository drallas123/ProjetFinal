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
public class UserDTO {
    private Long id;
    private String email;
    private String username;
    private String password;
    private String paymentMethod;
    private AddressDTO address;
    private List<RoleDTO> roles;
    private GroupDTO group;

    private String token;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean creditialsNonExpired;
    private boolean enabled;

}
