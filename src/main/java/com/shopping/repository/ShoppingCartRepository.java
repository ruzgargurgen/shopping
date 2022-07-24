package com.shopping.repository;

import com.shopping.dtos.ShoppingCartDto;
import com.shopping.dtos.ShoppingCartWrapperDto;
import com.shopping.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {


    @Query(
            value = "select new com.shopping.dtos.ShoppingCartDto(cart) from ShoppingCart cart where cart.id=:id"
    )
    ShoppingCartDto getShoppingCartById(@Param("id") Long id);


    @Query(
            value = "select new com.shopping.dtos.ShoppingCartWrapperDto(cart.id," +
                    "cart.orderNumber," +
                    "item.id," +
                    "product.name," +
                    "product.price," +
                    "category.name," +
                    "item.quantity)" +
                    " from ShoppingCart cart join cart.items item " +
                    "                        join item.product product " +
                    "                        join product.category category" +
                    " where cart.id=:id")
    List<ShoppingCartWrapperDto> getShoppingCartWrapperDtoById(Long id);
}
