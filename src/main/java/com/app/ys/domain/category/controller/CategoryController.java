package com.app.ys.domain.category.controller;

import com.app.ys.domain.category.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CategoryController {

    private final CategoryRepository categoryRepository;

}
