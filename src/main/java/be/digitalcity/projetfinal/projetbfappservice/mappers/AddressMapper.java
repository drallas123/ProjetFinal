package be.digitalcity.projetfinal.projetbfappservice.mappers;

import be.digitalcity.projetfinal.projetbfappservice.models.dto.AddressDTO;
import be.digitalcity.projetfinal.projetbfappservice.models.entities.Address;
import be.digitalcity.projetfinal.projetbfappservice.models.form.AddressForm;
import org.springframework.stereotype.Service;

@Service
public class AddressMapper implements BaseMapper<AddressDTO, AddressForm, Address> {
    @Override
    public Address toEntity(AddressDTO dto) {
        if (dto == null)
            return null;

        Address address = new Address(
                dto.getStreet(),
                dto.getNumber(),
                dto.getPostCode(),
                dto.getCity(),
                dto.getCountry()
        );
        address.setId(dto.getId());

        return address;
    }

    @Override
    public AddressDTO toDto(Address entity) {

        if (entity == null)
            return null;

        AddressDTO addressDTO = new AddressDTO();

        addressDTO.setStreet(entity.getStreet());
        addressDTO.setNumber(entity.getNumber());
        addressDTO.setCity(entity.getCity());
        addressDTO.setPostCode(entity.getPostCode());
        addressDTO.setCountry(entity.getCountry());
        addressDTO.setId(entity.getId());


        return addressDTO;
    }

    @Override
    public Address fromFormToEntity(AddressForm form) {

        if (form == null)
            return null;

        Address address = new Address();

        address.setStreet(form.getStreet());
        address.setNumber(form.getNumber());
        address.setCity(form.getCity());
        address.setPostCode(form.getPostCode());

        return address;
    }
}
