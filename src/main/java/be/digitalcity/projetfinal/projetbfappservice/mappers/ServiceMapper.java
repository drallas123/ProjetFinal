package be.digitalcity.projetfinal.projetbfappservice.mappers;

import be.digitalcity.projetfinal.projetbfappservice.models.dto.ServiceDTO;
import be.digitalcity.projetfinal.projetbfappservice.models.entities.Service;
import be.digitalcity.projetfinal.projetbfappservice.models.form.ServiceForm;

public class ServiceMapper implements BaseMapper<ServiceDTO, ServiceForm, Service> {
    @Override
    public Service toEntity(ServiceDTO dto) {
        if (dto == null) return null;

        Service service = new Service(
                dto.getName()
        );
        service.setId(dto.getId());

        return service;
    }

    @Override
    public ServiceDTO toDto(Service entity) {
        if (entity == null) return null;

        ServiceDTO serviceDTO = new ServiceDTO();

        serviceDTO.setName(entity.getName());
        serviceDTO.setId(entity.getId());

        return serviceDTO;
    }

    @Override
    public Service fromFormToEntity(ServiceForm form) {
        if (form == null) return null;

        return new Service(
                form.getName()
        );
    }
}
