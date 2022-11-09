package com.fiba.commerce.presentation.rest;

import com.fiba.commerce.business.dto.CategoryDto;
import com.fiba.commerce.business.dto.ProductDto;
import com.fiba.commerce.business.service.CategoryService;
import com.fiba.commerce.business.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InventoryController {

    private CategoryService categoryService;
    private ProductService productService;

    InventoryController(CategoryService categoryService, ProductService productService){
        this.categoryService =categoryService;
        this.productService =productService;
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

    @GetMapping("/commerce/inventory/product/{id}")
    public ProductDto getProduct(@PathVariable("id")long productId) {
        ProductDto product = productService.find(productId);
        return product;
    }

    @GetMapping("/commerce/inventory/products/{categoryId}")
    public List<ProductDto> getProductsByCategory(@PathVariable("categoryId")long categoryId) {
        return productService.findAllByCategoryId(categoryId);
    }

}
