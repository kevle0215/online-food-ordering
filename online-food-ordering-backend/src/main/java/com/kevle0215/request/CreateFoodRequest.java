package com.kevle0215.request;

import java.util.List;

import com.kevle0215.model.Category;
import com.kevle0215.model.IngredientsItem;

import lombok.Data;

@Data
public class CreateFoodRequest {

    private String name;
    private String description;
    private Long price;

    private Category category;
    private List<String> images;

    private Long restaurantId;
    private boolean vegetarian;
    private boolean seasonal;
    private List<IngredientsItem> ingredients;
}
