package com.nazar.ProductManager.service;

import com.nazar.ProductManager.entity.Category;
import com.nazar.ProductManager.repository.CategoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public List<Category> readAll() {
        return categoryRepository.findAll();
    }

    public Category readById(Long id) {
        return categoryRepository.findById(id).orElseThrow(()->
                new RuntimeException("Category with id " + id + " not found"));
    }

}
