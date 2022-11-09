package com.fiba.commerce.data.component;

import com.fiba.commerce.data.dto.CategoryInventoryDto;

import java.util.List;

public interface CategoryComponent {
    List<CategoryInventoryDto> findAll();
    CategoryInventoryDto findById(long categoryId);

}
