package com.fiba.commerce.data.component;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CartComponentImpl implements CartComponent{
    @Override
    public long save() {

        String url="http://localhost:8082/shopping/cart/create";

        RestTemplate restTemplate= new RestTemplate();
        long resultId = restTemplate.getForObject(url,Long.class);

        return resultId;
    }

    @Override
    public void checkoutCart(long cartId) {
        String url = "http://localhost:8082/shopping/checkout/"+cartId;

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject(url, Void.class);
    }
}
