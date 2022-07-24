package com.shopping.dtos;

import java.math.BigDecimal;


public class ShoppingCartWrapperDto {

    private Long cartId;

    private Long orderNumber;

    private Long itemId;

    private String productName;

    private BigDecimal productPrice;

    private String categoryName;

    private Long quantity;

    private boolean isMaximumStock=false;

    public ShoppingCartWrapperDto(Long cartId, Long orderNumber, Long itemId, String productName, BigDecimal productPrice, String categoryName, Long quantity) {
        this.cartId = cartId;
        this.orderNumber = orderNumber;
        this.itemId = itemId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.categoryName = categoryName;
        this.quantity = quantity;

        isMaximumStock=quantity>5;

    }

    public BigDecimal getTotalItemPrice(){
        return productPrice.multiply(new BigDecimal(quantity));
    }


}
