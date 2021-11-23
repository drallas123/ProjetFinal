package be.digitalcity.projetfinal.projetbfappservice.mappers;

import be.digitalcity.projetfinal.projetbfappservice.models.dto.OrderDTO;
import be.digitalcity.projetfinal.projetbfappservice.models.entities.Order;
import be.digitalcity.projetfinal.projetbfappservice.models.form.OrderForm;

public class OrderMapper implements BaseMapper<OrderDTO, OrderForm, Order> {
    private final UserMapper userMapper;
    private final ServiceMapper serviceMapper;

    public OrderMapper(UserMapper userMapper, ServiceMapper serviceMapper) {
        this.userMapper = userMapper;
        this.serviceMapper = serviceMapper;
    }

    @Override
    public Order toEntity(OrderDTO dto) {
        return null;
    }

    @Override
    public OrderDTO toDto(Order entity) {
        return null;
    }

    @Override
    public Order fromFormToEntity(OrderForm form) {
        return null;
    }
}
