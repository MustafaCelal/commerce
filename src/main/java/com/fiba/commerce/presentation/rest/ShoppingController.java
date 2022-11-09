package com.fiba.commerce.presentation.rest;

import com.fiba.commerce.business.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {

    private CartService cartService;

    public ShoppingController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/commerce/shopping/cart/create")
    public long createCart() {
        return cartService.create();
    }
}
