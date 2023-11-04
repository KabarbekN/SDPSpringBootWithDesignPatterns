package com.example.ecommerceapplicationspring.controller;


import com.example.ecommerceapplicationspring.model.Product;
import com.example.ecommerceapplicationspring.model.dto.ProductDto;
import com.example.ecommerceapplicationspring.model.enums.ProductType;
import com.example.ecommerceapplicationspring.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{type}")
    public ResponseEntity<List<Product>> findByType(@PathVariable String type){
        return ResponseEntity.ok(productService.findByProductType(type));
    }

    @PostMapping
    public ResponseEntity<?> createProduct(@RequestBody ProductDto productDto){
        return ResponseEntity.ok(productService.createProduct(productDto));
    }
}
