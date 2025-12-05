package com.dynamicbiz.POS.ProductService.repository;

import com.dynamicbiz.POS.ProductService.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository  extends JpaRepository<Product,String> {
}
