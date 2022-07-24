package com.shopping.startup;

import com.shopping.dtos.ShoppingCartDto;
import com.shopping.dtos.ShoppingCartWrapperDto;
import com.shopping.repository.ShoppingCartRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Startup implements CommandLineRunner {

  private final   ShoppingCartRepository shoppingCartRepository;

    public Startup(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }


    @Override
    public void run(String... args) throws Exception {
//        ShoppingCartDto cart= this.shoppingCartRepository.getShoppingCartById(1l);

       List<ShoppingCartWrapperDto> cart= this.shoppingCartRepository.getShoppingCartWrapperDtoById(1l);

        System.out.println(cart);
    }
}
