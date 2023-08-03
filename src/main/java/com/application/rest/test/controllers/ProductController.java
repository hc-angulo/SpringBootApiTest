package com.application.rest.test.controllers;

import com.application.rest.test.entities.Maker;
import com.application.rest.test.entities.Product;
import com.application.rest.test.services.IMakerService;
import com.application.rest.test.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    IProductService productService;
    @GetMapping("/find")
    public List<Product> findAll(){
        return productService.findAll();
    }
    @PostMapping("/create")
    public String createMaker(@RequestBody Product product){
        productService.save(product);
        return "Producto creado exitosamente";
    }

    @GetMapping("/findByPrice")
    public List<Product> findByPriceInRange(@RequestParam BigDecimal minPrice,@RequestParam BigDecimal maxPrice){
        return productService.findByPriceInRange(minPrice,maxPrice);
    }
}
