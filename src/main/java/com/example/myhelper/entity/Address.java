package com.example.myhelper.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString(exclude = "user")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String city;
    private String street;
    private String number;
    @OneToOne(optional = false)
    @JoinColumn(name = "user_id",foreignKey = @ForeignKey(name = "address_users_fk"))
    private User user;

}
