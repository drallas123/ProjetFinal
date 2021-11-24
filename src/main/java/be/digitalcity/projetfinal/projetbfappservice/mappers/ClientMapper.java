package be.digitalcity.projetfinal.projetbfappservice.mappers;

import be.digitalcity.projetfinal.projetbfappservice.models.dto.ClientDTO;
import be.digitalcity.projetfinal.projetbfappservice.models.entities.Client;
import be.digitalcity.projetfinal.projetbfappservice.models.form.ClientForm;

public class ClientMapper implements BaseMapper<ClientDTO, ClientForm, Client> {

    @Override
    public Client toEntity(ClientDTO dto) {
        return null;
    }

    @Override
    public ClientDTO toDto(Client entity) {
        return null;
    }

    @Override
    public Client fromFormToEntity(ClientForm form) {
        return null;
    }
}
