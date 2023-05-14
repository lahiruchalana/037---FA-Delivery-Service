package com.example.delivery_service.delivery;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "delivery")
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO,generator = "delivery_seq_id")
    @Column(name = "id", nullable = false)
    private Long id;

    /**
     *  ex - {lat: 46.990, lon: 34.789, address_line_one: kaluthara, address_line_two: mathugama, address_line_three: agalawaththa, province: western}
     */
    @Column(name = "delivery_location_string")
    private Integer deliveryLocationString;

    @Column(name = "order_id")
    private Integer orderId;

    /**
     *  ex - {109, 3, 5, 77, 432}
     */
    @Column(name = "item_set")
    private String itemSet;

    @Column(name = "total_price")
    private Integer totalPrice;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_date", updatable = false)
    private Date createdDate;

    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_date")
    private Date updatedDate;

}
