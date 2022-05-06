package com.nomedaempresa.course.resources;

import com.nomedaempresa.course.entities.BaseEntity;
import com.nomedaempresa.course.services.BaseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

public class BaseResource<T extends BaseEntity> {

    private final BaseService<T> service;

    public BaseResource(BaseService<T> service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        List<T> list = service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<T> findById(@PathVariable Long id) {
        T obj = service.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping()
    public ResponseEntity<T> save(@RequestBody T obj) {
        T savedInstance = this.service.save(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                .buildAndExpand(savedInstance).toUri();
        return ResponseEntity.created(uri).body(savedInstance);
    }
}
