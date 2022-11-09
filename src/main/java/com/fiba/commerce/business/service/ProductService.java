package com.fiba.commerce.business.service;

import com.fiba.commerce.business.dto.ProductDto;

import java.util.List;

public interface ProductService {
    List<ProductDto> findAllByCategoryId(long categoryId);
    ProductDto find(long productId);
}
