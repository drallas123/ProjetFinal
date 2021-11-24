package be.digitalcity.projetfinal.projetbfappservice.mappers;

import be.digitalcity.projetfinal.projetbfappservice.models.dto.UserDTO;
import be.digitalcity.projetfinal.projetbfappservice.models.entities.User;
import be.digitalcity.projetfinal.projetbfappservice.models.form.userForm.UserRegisterForm;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.stream.Collectors;

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

        if (dto == null) return null;

        User user = new User();

        user.setId(dto.getId());
        user.setAddress(addressMapper.toEntity(dto.getAddress()));
        user.setEmail(dto.getEmail());
        user.setUsername(dto.getUsername());
        if (dto.getGroup() != null)
            user.setGroup(groupMapper.toEntity(dto.getGroup()));
        if (dto.getRoles() != null)
            user.setRoles(dto.getRoles().stream()
                    .map(roleMapper::toEntity)
                    .collect(Collectors.toList()));
        user.setAccountNonExpired(dto.isAccountNonExpired());
        user.setAccountNonLocked(dto.isAccountNonLocked());
        user.setCreditialsNonExpired(dto.isCreditialsNonExpired());
        user.setEnabled(dto.isEnabled());

        return user;
    }

    @Override
    public UserDTO toDto(User entity) {
        if (entity == null) return null;

        UserDTO userDTO = new UserDTO();

        userDTO.setUsername(entity.getUsername());
        userDTO.setEmail(entity.getEmail());
        userDTO.setAddress(addressMapper.toDto(entity.getAddress()));
        userDTO.setId(entity.getId());
        userDTO.setAccountNonExpired(entity.isAccountNonExpired());
        userDTO.setAccountNonLocked(entity.isAccountNonLocked());
        userDTO.setCreditialsNonExpired(entity.isCreditialsNonExpired());
        userDTO.setEnabled(entity.isEnabled());
        if(entity.getRoles() != null) {
            userDTO.setRoles(entity.getRoles()
                    .stream()
                    .map(roleMapper::toDto)
                    .collect(Collectors.toList()));
        }
        userDTO.setGroup(groupMapper.toDto(entity.getGroup()));

        return userDTO;
    }

    @Override
    public User fromFormToEntity(UserRegisterForm form) {
        if (form == null) return null;

        User user = new User();

        user.setPassword(form.getPassword());
        user.setUsername(form.getUsername());
        user.setEmail(form.getEmail());
        user.setAddress(form.getAddress());

        return user;
    }
}
