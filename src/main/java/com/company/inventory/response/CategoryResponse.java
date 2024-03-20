package com.company.inventory.response;

import com.company.inventory.model.Category;
import lombok.Data;

import java.util.List;


// Esta clase daclara un atributo privado de una lista de category
@Data
public class CategoryResponse {
    private List<Category> category;


}
