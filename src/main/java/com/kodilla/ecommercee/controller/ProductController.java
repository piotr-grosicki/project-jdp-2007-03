package com.kodilla.ecommercee.controller;

import com.kodilla.ecommercee.domain.dto.ProductDto;
import java.util.ArrayList;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    @GetMapping("/products")
    public List<ProductDto> getProducts(){
        return new ArrayList<>();
    }
    @GetMapping("/{productId}")
    public ProductDto getProduct(@PathParam("productId") Long productId) {
        return new ProductDto ();
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct (@PathParam("productId") Long productId){
    }

    @PutMapping("")
    public ProductDto updateProduct(@RequestBody ProductDto productDto){
        return new ProductDto ();
    }

    @PostMapping("")
    public void createProduct(@RequestBody ProductDto productDto){
    }
}
