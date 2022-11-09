package com.fiba.commerce.business.service;

import com.fiba.commerce.business.dto.CategoryDto;
import com.fiba.commerce.data.component.CategoryComponent;
import com.fiba.commerce.data.dto.CategoryInventoryDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private CategoryComponent categoryComponent;

    CategoryServiceImpl(CategoryComponent categoryComponent){
        this.categoryComponent=categoryComponent;
    }

    public CategoryDto findById(long categoryId) {
        CategoryInventoryDto categoryInventoryDto =categoryComponent.findById(categoryId);

        CategoryDto categoryDto=new CategoryDto();

        categoryDto.setCategoryId(categoryInventoryDto.getCategoryId());
        categoryDto.setCategoryName(categoryInventoryDto.getCategoryName());

        return categoryDto;
    }

    public List<CategoryDto> findAll() {
        List<CategoryDto> categories=new ArrayList<>();

        List<CategoryInventoryDto> categoryInventoryDtos =categoryComponent.findAll();

        for (int i = 0; i < categoryInventoryDtos.size(); i++) {
            CategoryDto categoryDto=new CategoryDto();

            categoryDto.setCategoryId(categoryInventoryDtos.get(i).getCategoryId());
            categoryDto.setCategoryName(categoryInventoryDtos.get(i).getCategoryName());

            categories.add(categoryDto);
        }
/*
        for (CategoryInventoryDto categoryInventoryDto : categoryInventoryDtos){
          CategoryDto categoryDto=new CategoryDto();

          categoryDto.setCategoryId(categoryInventoryDto.getCategoryId());
          categoryDto.setCategoryName(categoryInventoryDto.getCategoryName());

          categories.add(categoryDto);
        }

 */
        return categories;
    }

}
