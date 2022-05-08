package com.nomedaempresa.course.resources;

import com.nomedaempresa.course.entities.Category;
import com.nomedaempresa.course.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource extends BaseResource<Category> {

    @Autowired
    public CategoryResource(CategoryService categoryService) {
        super(categoryService);
    }

}