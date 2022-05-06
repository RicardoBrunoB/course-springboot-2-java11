package com.nomedaempresa.course.services;

import java.util.List;

public interface BaseService<T> {
    List<T> findAll();

    T findById(Long id);

    T save(T obj);
}
