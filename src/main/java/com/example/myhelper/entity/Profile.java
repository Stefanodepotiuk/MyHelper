package com.example.myhelper.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "profiles")
@Getter
@Setter
@ToString(exclude = "user")
public class Profile {
    @Id
    private Long id;
    private boolean active;
    private String pictureURL;
    @MapsId
    @OneToOne(optional = false)
    @JoinColumn(name = "user_id",foreignKey = @ForeignKey(name = "profiles_users_fk"))
    private User user;
    // Цей спосіб для типу звязку коли child не може існувати без parent
}
