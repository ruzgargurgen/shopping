package com.shopping.dtos;

import com.shopping.entity.ShoppingCart;
import com.shopping.entity.ShoppingItem;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ShoppingCartDto implements Serializable {

    private Long cartId;

    private Long orderNumber;

    private List<ShoppingItemDto> items;

    public ShoppingCartDto(ShoppingCart cart) {
        cartId = cart.getId();
        orderNumber = cart.getOrderNumber();
        setShoppingItems(cart.getItems());
    }

    private void setShoppingItems(List<ShoppingItem> items) {
        if (items != null && !items.isEmpty()) {
            this.items = items.stream()
                    .map(item -> ShoppingItemDto.builder()
                            .itemId(item.getId())
                            .productName(item.getProduct().getName())
                            .categoryName(item.getProduct().getCategory().getName())
                            .productPrice(item.getProduct().getPrice())
                            .quantity(item.getQuantity())
                            .build()).collect(Collectors.toList());
        }
    }

    public BigDecimal getTotalPrice() {
        if (this.items == null || this.items.isEmpty()) {
            return BigDecimal.ZERO;
        }

        return this.items
                .stream()
                .map(ShoppingItemDto::getTotalItemPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<ShoppingItemDto> getItems() {
        return items;
    }

    public void setItems(List<ShoppingItemDto> items) {
        this.items = items;
    }
}
