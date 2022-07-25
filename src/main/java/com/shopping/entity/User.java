package com.shopping.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String username;

    private String password;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<UserRole> userRoles;
}
