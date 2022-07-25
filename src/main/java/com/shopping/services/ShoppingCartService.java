package com.shopping.services;

import com.shopping.dtos.ShoppingCartWrapperDto;

import java.util.List;

public interface ShoppingCartService {
    List<ShoppingCartWrapperDto> getAllShoppingCart();
}
