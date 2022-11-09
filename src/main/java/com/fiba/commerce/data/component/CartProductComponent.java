package com.fiba.commerce.data.component;

import com.fiba.commerce.data.dto.CartProductShoppingDto;

public interface CartProductComponent {
    void save(CartProductShoppingDto cartProductShoppingDto);
    void deleteProduct(long cartId,long productId);
}
