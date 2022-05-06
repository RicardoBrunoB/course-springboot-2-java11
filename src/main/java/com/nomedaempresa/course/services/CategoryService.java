package com.nomedaempresa.course.services;

import com.nomedaempresa.course.entities.Category;
import com.nomedaempresa.course.repositories.CategoryRepository;
import com.nomedaempresa.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements BaseService<Category> {

    private final CategoryRepository repository;

    @Autowired
    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    @Override
    public Category save(Category obj) {
        return this.repository.save(obj);
    }
}
