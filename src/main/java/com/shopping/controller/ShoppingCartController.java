package com.shopping.controller;

import com.shopping.dtos.ShoppingCartWrapperDto;
import com.shopping.services.ShoppingCartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/shoppingCart")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }
    @GetMapping
    public ResponseEntity<List<ShoppingCartWrapperDto>> getAllShoppingCart(){
        return ResponseEntity.ok(shoppingCartService.getAllShoppingCart());
    }
}
