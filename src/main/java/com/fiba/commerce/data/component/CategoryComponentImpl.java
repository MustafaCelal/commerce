package com.fiba.commerce.data.component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fiba.commerce.data.dto.CategoryInventoryDto;
import com.fiba.commerce.data.dto.CategoryInventoryDtoList;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoryComponentImpl implements CategoryComponent{

    @Override
    public List<CategoryInventoryDto> findAll() {
        /*String url="http://localhost:8081/inventory/categories";

        RestTemplate restTemplate= new RestTemplate();
        CategoryInventoryDtoList categoryInventoryDtos = restTemplate.getForObject(url, CategoryInventoryDtoList.class);


        return categoryInventoryDtos.getCategoryInventoryDtos();*/


        String url="http://localhost:8081/inventory/categories";
        List<CategoryInventoryDto> res=new ArrayList<>();
        RestTemplate restTemplate= new RestTemplate();
        CategoryInventoryDto[] categoryInventoryDtos = restTemplate.getForObject(url, CategoryInventoryDto[].class);


        for (int i = 0; i < categoryInventoryDtos.length; i++) {
            res.add(new CategoryInventoryDto(
                    categoryInventoryDtos[i].getCategoryId()
                    ,categoryInventoryDtos[i].getCategoryName()));
        }
        return res;
    }

    @Override
    public CategoryInventoryDto findById(long categoryId) {
        String url = "http://localhost:8081/inventory/category/"+categoryId;

        RestTemplate restTemplate = new RestTemplate();
        CategoryInventoryDto categoryInventoryDto = restTemplate.getForObject(url, CategoryInventoryDto.class);


        return categoryInventoryDto;
    }

}
