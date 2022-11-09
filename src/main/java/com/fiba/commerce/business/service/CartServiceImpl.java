package com.fiba.commerce.business.service;

import com.fiba.commerce.data.component.CartComponent;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService{
    private CartComponent cartComponent;

    CartServiceImpl(CartComponent cartComponent){
        this.cartComponent=cartComponent;
    }

    @Override
    public long create() {
        return cartComponent.save();
    }

    @Override
    public void checkoutCart(long cartId) {
        cartComponent.checkoutCart(cartId);
    }
}
