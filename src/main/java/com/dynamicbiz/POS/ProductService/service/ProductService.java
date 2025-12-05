package com.dynamicbiz.POS.ProductService.service;


import com.dynamicbiz.POS.ProductService.dto.ProductRequest;
import com.dynamicbiz.POS.ProductService.dto.ProductResponse;
import com.dynamicbiz.POS.ProductService.model.Product;
import com.dynamicbiz.POS.ProductService.repository.ProductRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(ProductRequest productRequest){
        Product product=new Product();
        product.setId(productRequest.getId());
        product.setName(productRequest.getName());
        product.setDescription(productRequest.getDescription());
        product.setPrice(productRequest.getPrice());

        Product result=productRepository.save(product);
        return result;
        //log.info("Product {} is successfully saved",product.getId());

    }

    public List<ProductResponse> getAllProducts(){
        List<Product> products=productRepository.findAll();
        return products.stream().map(this::mapToProductResponse).toList();
        //return productRepository.getReferenceById(id);
    }

    private ProductResponse mapToProductResponse(Product product) {
        ProductResponse productResponse=new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setName(product.getName());
        productResponse.setDescription(product.getDescription());
        productResponse.setPrice((product.getPrice()));

        return productResponse;
    }
}
