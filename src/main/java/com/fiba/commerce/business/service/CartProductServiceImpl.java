package com.fiba.commerce.business.service;

import com.fiba.commerce.business.dto.CartProductDto;
import com.fiba.commerce.data.component.CartProductComponent;
import com.fiba.commerce.data.dto.CartProductShoppingDto;
import org.springframework.stereotype.Service;

@Service
public class CartProductServiceImpl implements CartProductService{

    CartProductComponent cartProductComponent;

    CartProductServiceImpl(CartProductComponent cartProductComponent){
        this.cartProductComponent = cartProductComponent;
    }

    @Override
    public void add(CartProductDto cartProductDto) {
        CartProductShoppingDto cartProductShoppingDto=new CartProductShoppingDto();

        cartProductShoppingDto.setProductId(cartProductDto.getProductId());
        cartProductShoppingDto.setLineAmount(cartProductDto.getLineAmount());
        cartProductShoppingDto.setSalesPrice(cartProductDto.getSalesPrice());
        cartProductShoppingDto.setSalesQuantity(cartProductDto.getSalesQuantity());
        cartProductShoppingDto.setCartId(cartProductDto.getCartId());

        cartProductComponent.save(cartProductShoppingDto);
    }
}
