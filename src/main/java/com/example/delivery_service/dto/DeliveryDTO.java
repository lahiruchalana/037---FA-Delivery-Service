package com.example.delivery_service.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeliveryDTO {

    private Long id;
    private Integer deliveryLocationString;
    private Integer orderId;
    private String itemSet;
    private Integer totalPrice;
    private Date createdDate;
    private Date updatedDate;

}
