package com.example.delivery_service.delivery;

import com.example.delivery_service.dto.DeliveryDTO;
import com.example.delivery_service.exceptions.CustomException;
import com.example.delivery_service.modelmapper.DeliveryModelMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class DeliveryServiceImpl implements DeliveryService {

    private final DeliveryRepository deliveryRepository;

    @Override
    public DeliveryDTO addOrUpdateDelivery(DeliveryDTO deliveryDTO) {
        log.info ("LOG :: DeliveryServiceImpl addOrUpdateDelivery()");
        DeliveryDTO deliveryDTOSaved;
        try {
            log.info ("LOG :: DeliveryServiceImpl addOrUpdateDelivery() inside try");
            Delivery delivery = DeliveryModelMapper.mapDTOToEntity(deliveryDTO);
            Delivery deliverySaved = deliveryRepository.save(delivery);
            deliveryDTOSaved = DeliveryModelMapper.mapEntityToDto(deliverySaved);
        } catch (Exception e) {
            log.info ("LOG :: DeliveryServiceImpl addOrUpdateDelivery() inside catch");
            throw new CustomException("An error occurred while handling the exception: " + e.getMessage());
        }
        return deliveryDTOSaved;    }
}
