package com.example.delivery_service.modelmapper;

import com.example.delivery_service.delivery.Delivery;
import com.example.delivery_service.dto.DeliveryDTO;

public class DeliveryModelMapper {

    public static Delivery mapDTOToEntity(DeliveryDTO dto) {
        Delivery entity = new Delivery();
        entity.setId(dto.getId());
        entity.setDeliveryLocationString(dto.getDeliveryLocationString());
        entity.setOrderId(dto.getOrderId());
        entity.setItemSet(dto.getItemSet());
        entity.setTotalPrice(dto.getTotalPrice());
        entity.setCreatedDate(dto.getCreatedDate());
        entity.setUpdatedDate(dto.getUpdatedDate());
        return entity;
    }

    public static DeliveryDTO mapEntityToDto(Delivery entity) {
        DeliveryDTO dto = new DeliveryDTO();
        dto.setId(entity.getId());
        dto.setDeliveryLocationString(entity.getDeliveryLocationString());
        dto.setOrderId(entity.getOrderId());
        dto.setItemSet(entity.getItemSet());
        dto.setTotalPrice(entity.getTotalPrice());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setUpdatedDate(entity.getUpdatedDate());
        return dto;
    }

}
