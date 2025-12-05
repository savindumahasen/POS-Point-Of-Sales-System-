package com.dynamicbiz.POS.ProductService.controller;


import com.dynamicbiz.POS.ProductService.dto.ProductRequest;
import com.dynamicbiz.POS.ProductService.dto.ProductResponse;
import com.dynamicbiz.POS.ProductService.model.Product;
import com.dynamicbiz.POS.ProductService.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    // Add the products
    public String createProduct(@RequestBody ProductRequest productRequest){
        Product result=productService.createProduct(productRequest);
        if(result!=null){
            return result.getName()+" Product is successfully added";

        }else{
            return result.getName()+" Product is not successfully added";
        }

    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    // Get All Products
    public List<ProductResponse> getAllProducts(){


        return productService.getAllProducts();
    }
}
