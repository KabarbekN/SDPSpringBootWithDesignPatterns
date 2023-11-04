package com.example.ecommerceapplicationspring.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.stereotype.Repository;



@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userid" )
    private Long userid;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
}
