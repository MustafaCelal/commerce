package com.fiba.commerce.business.service;

import com.fiba.commerce.business.dto.ProductDto;
import com.fiba.commerce.data.component.ProductComponent;
import com.fiba.commerce.data.dto.ProductInventoryDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    private ProductComponent productComponent;

    ProductServiceImpl(ProductComponent productComponent){
        this.productComponent = productComponent;
    }

    @Override
    public List<ProductDto> findAllByCategoryId(long categoryId) {
        List<ProductDto> result=new ArrayList<>();
        Iterable<ProductInventoryDto> products = productComponent.findAllByCategoryId(categoryId);

        for(ProductInventoryDto product:products) {
            ProductDto productDto = new ProductDto();

            productDto.setProductId(product.getProductId());
            productDto.setProductName(product.getProductName());
            productDto.setSalesPrice(product.getSalesPrice());

            result.add(productDto);
        }

        return result;
    }


    @Override
    public ProductDto find(long productId) {

        ProductDto productDto = new ProductDto();
        ProductInventoryDto product=productComponent.findById(productId);

        productDto.setProductId(product.getProductId());
        productDto.setProductName(product.getProductName());
        productDto.setSalesPrice(product.getSalesPrice());

        return productDto;
    }

}
