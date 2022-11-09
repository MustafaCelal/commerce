package com.fiba.commerce.business.service;

public interface CartService {
    long create();
    void checkoutCart(long cartId);
}
