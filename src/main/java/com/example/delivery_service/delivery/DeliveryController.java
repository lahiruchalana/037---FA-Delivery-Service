package com.example.delivery_service.delivery;

import com.example.delivery_service.dto.DeliveryDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/menu-type")
@RequiredArgsConstructor
@Slf4j
public class DeliveryController {

    private final DeliveryService deliveryService;

    @PostMapping("/add-or-update")
    public ResponseEntity<DeliveryDTO> addOrUpdateDelivery(
            @RequestBody DeliveryDTO deliveryDTO
    ) {
        log.info ("LOG :: DeliveryController addOrUpdateDelivery()");
        return new ResponseEntity<>(deliveryService.addOrUpdateDelivery(deliveryDTO), HttpStatus.OK);
    }

}
