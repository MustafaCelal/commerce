package com.fiba.commerce.data.component;

public interface CartComponent {
    long save();
    void checkoutCart(long cartId);
}
