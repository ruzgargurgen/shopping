package com.shopping.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product extends BaseEntity<Long> {

    private String name;

    private BigDecimal price;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,optional = false)
    @JoinColumn(name="categoryId")
    private Category category;

}
