package com.example.ecommerceapplicationspring.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orderitem")
@Entity
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderitemid;

    @ManyToOne
    @JoinColumn(name = "product_productid")
    private Product product;
    private int quantity;

    @ManyToOne
    private Order order;
}
