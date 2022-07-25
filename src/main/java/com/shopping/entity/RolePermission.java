package com.shopping.entity;

import javax.persistence.*;

@Entity
@Table
public class RolePermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ROLE_ID", referencedColumnName = "id")
    private Role role;

    @ManyToOne
    @JoinColumn(name = "PERMISSION_ID", referencedColumnName = "id")
    private Permission permission;
}
