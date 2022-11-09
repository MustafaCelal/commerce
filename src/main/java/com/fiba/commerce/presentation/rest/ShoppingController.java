package com.fiba.commerce.presentation.rest;

import com.fiba.commerce.business.dto.CartProductDto;
import com.fiba.commerce.business.service.CartProductService;
import com.fiba.commerce.business.service.CartService;
import org.springframework.web.bind.annotation.*;

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

    @DeleteMapping("/commerce/shopping/cart/{cartId}/remove/{productId}")
    public void delete(@PathVariable("cartId") long cartId
            ,@PathVariable("productId") long productId) {
        cartProductService.deleteProduct(cartId,productId);
    }

    @GetMapping("/commerce/shopping/checkout/{cartId}")
    public void checkoutCart(@PathVariable("cartId") long cartId) {
        cartService.checkoutCart(cartId);
    }

}
