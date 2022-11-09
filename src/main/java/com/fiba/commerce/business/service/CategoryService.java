package com.fiba.commerce.business.service;

import com.fiba.commerce.business.dto.CategoryDto;

import java.util.List;

public interface CategoryService {
    List<CategoryDto> findAll();
    CategoryDto findById(long categoryId);
}
