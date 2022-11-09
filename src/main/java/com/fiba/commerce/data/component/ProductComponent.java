package com.fiba.commerce.data.component;

import com.fiba.commerce.data.dto.ProductInventoryDto;

import java.util.List;

public interface ProductComponent {

    List<ProductInventoryDto> findAllByCategoryId(long categoryId);
    ProductInventoryDto findById(long productId);
}
