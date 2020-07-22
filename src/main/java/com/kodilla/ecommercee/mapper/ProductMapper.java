package com.kodilla.ecommercee.mapper;

import com.kodilla.ecommercee.domain.Product;
import com.kodilla.ecommercee.domain.ProductDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {
    public Product mapToProduct(final ProductDto productDto){
        return new Product(
                productDto.getId(),
                productDto.getName(),
                productDto.getPrice(),
                productDto.getPictureUrl(),
                productDto.getManufacturer());
    }
    public ProductDto mapToProductDto(final Product product){
        return new ProductDto(
                product.getId(),
                product.getName(),
                product.getPrice(),
                product.getPictureUrl(),
                product.getManufacturer()
        );
    }
    public List<ProductDto> mapToProductDtoList(final List<Product> productList){
        return productList.stream()
                .map(p->new ProductDto(p.getId(), p.getName(),p.getPrice(),p.getPictureUrl(),p.getManufacturer()))
                .collect(Collectors.toList());
    }

}
