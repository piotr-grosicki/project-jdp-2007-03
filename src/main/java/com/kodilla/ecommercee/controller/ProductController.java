package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.dto.ProductDto;
import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    @GetMapping("/products")
    public List<ProductDto> getProducts(){
        return new ArrayList<>();
    }
    @GetMapping("/{productId}")
    public ProductDto getProduct(@PathVariable("productId") Long productId) {
        return new ProductDto ();
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct (@PathVariable("productId") Long productId){
    }

    @PutMapping("")
    public ProductDto updateProduct(@RequestBody ProductDto productDto){
        return new ProductDto ();
    }

    @PostMapping("")
    public void createProduct(@RequestBody ProductDto productDto){
    }
}
