package com.fiba.commerce.data.dto;

import java.util.ArrayList;
import java.util.List;

public class CategoryInventoryDtoList {

    private List<CategoryInventoryDto> categoryInventoryDtos;

    public CategoryInventoryDtoList() {
        categoryInventoryDtos = new ArrayList<>();
    }


    public List<CategoryInventoryDto> getCategoryInventoryDtos() {
        return categoryInventoryDtos;
    }
}
