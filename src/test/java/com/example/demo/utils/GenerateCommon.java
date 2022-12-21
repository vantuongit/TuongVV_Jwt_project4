package com.example.demo.utils;

import com.example.demo.entities.Cart;
import com.example.demo.entities.Item;
import com.example.demo.entities.User;
import java.math.BigDecimal;
import java.util.ArrayList;

public class GenerateCommon {

    public static User createUser() {
        User user = new User();
        user.setId(1);
        user.setUsername("UserName");
        user.setPassword("P@ssw0rd");
        user.setCart(new Cart());
        return user;
    }

    public static Cart createCart() {
        Cart cart = new Cart();
        cart.setId(1L);
        cart.setTotal(null);
        cart.setItems(new ArrayList<>());
        cart.setTotal(BigDecimal.valueOf(0.0));
        return cart;
    }

    public static Item createItem() {
        Item item = new Item();
        item.setId(1L);
        item.setName("New Item");
        item.setDescription("This is a new item");
        item.setPrice(BigDecimal.valueOf(100.0));
        return item;
    }



}
