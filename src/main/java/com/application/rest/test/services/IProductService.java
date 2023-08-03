package com.application.rest.test.services;

import com.application.rest.test.entities.Product;

import java.math.BigDecimal;
import java.util.List;

public interface IProductService {
    List<Product> findAll();

    Product findById(Long id);

    List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

    void save(Product product);

    void deleteById(Long id);
}
