package com.fiba.commerce.presentation.rest;

import com.fiba.commerce.business.dto.CartProductDto;
import com.fiba.commerce.business.service.CartProductService;
import com.fiba.commerce.business.service.CartService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {

    private CartService cartService;
    private CartProductService cartProductService;

    public ShoppingController(CartService cartService, CartProductService cartProductService) {
        this.cartService = cartService;
        this.cartProductService=cartProductService;
    }

    @GetMapping("/commerce/shopping/cart/create")
    public long createCart() {
        return cartService.create();
    }

    @PostMapping("/commerce/shopping/cart/add")
    public void addToCart(@RequestBody CartProductDto cartProductDto) {

        cartProductService.add(cartProductDto);
    }
}
