package com.nomedaempresa.course.services;

import com.nomedaempresa.course.entities.Product;
import com.nomedaempresa.course.repositories.ProductRepository;
import com.nomedaempresa.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements BaseService<Product> {

    private final ProductRepository repository;

    @Autowired
    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    @Override
    public Product save(Product obj) {
        return this.repository.save(obj);
    }
}
