package be.digitalcity.projetfinal.projetbfappservice.mappers;

import be.digitalcity.projetfinal.projetbfappservice.models.dto.UserDTO;
import be.digitalcity.projetfinal.projetbfappservice.models.entities.abstractClass.User;
import be.digitalcity.projetfinal.projetbfappservice.models.form.userForm.UserRegisterForm;
import org.springframework.security.crypto.password.PasswordEncoder;

public class UserMapper implements BaseMapper<UserDTO, UserRegisterForm, User> {

    private final AddressMapper addressMapper;
    private final RoleMapper roleMapper;
    private final GroupMapper groupMapper;

    public UserMapper(AddressMapper addressMapper, RoleMapper roleMapper, GroupMapper groupMapper, PasswordEncoder encoder) {
        this.addressMapper = addressMapper;
        this.roleMapper = roleMapper;
        this.groupMapper = groupMapper;
    }


    @Override
    public User toEntity(UserDTO dto) {
        return null;
    }

    @Override
    public UserDTO toDto(User entity) {
        return null;
    }

    @Override
    public User fromFormToEntity(UserRegisterForm form) {
        return null;
    }
}
