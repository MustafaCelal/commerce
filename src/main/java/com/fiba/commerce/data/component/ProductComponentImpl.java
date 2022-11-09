package com.fiba.commerce.data.component;

import com.fiba.commerce.data.dto.ProductInventoryDto;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductComponentImpl implements ProductComponent{
    @Override
    public List<ProductInventoryDto> findAllByCategoryId(long categoryId) {
        String url = "http://localhost:8081/inventory/products/"+categoryId;

        List<ProductInventoryDto> res=new ArrayList<>();
        RestTemplate restTemplate= new RestTemplate();
        ProductInventoryDto[] productInventoryDtos = restTemplate.getForObject(url, ProductInventoryDto[].class);

        for (int i = 0; i < productInventoryDtos.length; i++) {
            res.add(new ProductInventoryDto(
                    productInventoryDtos[i].getProductId()
                    ,productInventoryDtos[i].getProductName(),productInventoryDtos[i].getSalesPrice()));
        }
        return res;
    }

    @Override
    public ProductInventoryDto findById(long productId) {
        String url = "http://localhost:8081/inventory/product/"+productId;

        RestTemplate restTemplate = new RestTemplate();
        ProductInventoryDto productInventoryDto = restTemplate.getForObject(url, ProductInventoryDto.class);

        return productInventoryDto;
    }

}
