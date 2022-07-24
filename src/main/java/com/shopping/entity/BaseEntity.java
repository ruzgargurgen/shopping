package com.shopping.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseEntity<ID extends Number> {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    private String code;

    private String description;

}
