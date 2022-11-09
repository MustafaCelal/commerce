package com.fiba.commerce.data.component;

import com.fiba.commerce.data.dto.CartProductShoppingDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CartProductComponentImpl implements CartProductComponent{

    @Override
    public void save(CartProductShoppingDto cartProductShoppingDto) {
        String url="http://localhost:8082/shopping/cart/add";

        RestTemplate restTemplate= new RestTemplate();
        restTemplate.postForObject(url,cartProductShoppingDto,Void.class);
    }

    @Override
    public void deleteProduct(long cartId, long productId) {
        String url="http://localhost:8082/shopping/cart/"+cartId+"/remove/"+productId;

        RestTemplate restTemplate= new RestTemplate();
        restTemplate.delete(url);
    }

}
