package com.fiba.commerce.presentation.rest;

import com.fiba.commerce.business.dto.CategoryDto;
import com.fiba.commerce.business.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {

    private CategoryService categoryService;

    InventoryController(CategoryService categoryService){
        this.categoryService =categoryService;
    }

    @GetMapping("/commerce/inventory/categories")
    public List<CategoryDto> getCategories() {
        List<CategoryDto> categories = categoryService.findAll();
        return categories;
    }


    @GetMapping("/commerce/inventory/category/{id}")
    public CategoryDto getCategory(@PathVariable("id")long categoryId) {
        CategoryDto category = categoryService.findById(categoryId);
        return category;
    }

}
