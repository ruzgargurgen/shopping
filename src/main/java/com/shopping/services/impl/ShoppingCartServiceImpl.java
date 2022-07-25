package com.shopping.services.impl;

import com.shopping.dtos.ShoppingCartWrapperDto;
import com.shopping.repository.ShoppingCartRepository;
import com.shopping.services.ShoppingCartService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartServiceImpl(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @Override
    public List<ShoppingCartWrapperDto> getAllShoppingCart() {
        return shoppingCartRepository.findAllShoppingCartWrapperDto();
    }
}
