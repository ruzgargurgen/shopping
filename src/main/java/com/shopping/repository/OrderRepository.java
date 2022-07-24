package com.shopping.repository;

import com.shopping.entity.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Repository
public interface OrderRepository extends JpaRepository<ShoppingCart,Long> {



}
