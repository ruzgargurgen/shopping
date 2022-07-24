package com.shopping.dtos;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ShoppingItemDto {

    private Long itemId;

    private String productName;

    private BigDecimal productPrice;

    private String categoryName;

    private Long quantity;


    public BigDecimal getTotalItemPrice(){
        return productPrice.multiply(new BigDecimal(quantity));
    }
}
