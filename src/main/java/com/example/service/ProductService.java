package com.example.service;

import com.example.domain.Product;

public interface ProductService {
    Product add(Product product);

    Product get(long id);
}
