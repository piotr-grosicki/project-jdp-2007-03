package com.kodilla.ecommercee;

import com.kodilla.ecommercee.domain.ProductDto;
import com.kodilla.ecommercee.mapper.ProductMapper;
import com.kodilla.ecommercee.service.DbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/v1/product")
public class ProductController {

    @Autowired
    private DbService service;

    @Autowired
    private ProductMapper productMapper;

    @RequestMapping(method = RequestMethod.GET, value = "getProducts")
    public List<ProductDto> getProducts(){
        return productMapper.mapToProductDtoList(service.getAllProducts());
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "deleteProduct")
    public void deleteProduct (Long productId){
        service.deleteProduct(productId);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "updateProduct")
    public ProductDto updateProduct(ProductDto productDto){
        return productMapper.mapToProductDto(service.saveProduct(productMapper.mapToProduct(productDto)));
    }

    @RequestMapping(method = RequestMethod.POST, value = "createProduct", consumes = APPLICATION_JSON_VALUE)
    public void createProduct(ProductDto productDto){
        service.saveProduct(productMapper.mapToProduct(productDto));
    }
}
