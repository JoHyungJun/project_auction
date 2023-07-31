package com.zerobase.auction.data.dao.Impl;

import com.zerobase.auction.data.dao.ProductDao;
import com.zerobase.auction.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductDaoImpl implements ProductDao {
  private final ProductRepository productRepository;

  @Autowired
  ProductDaoImpl(ProductRepository productRepository){
    this.productRepository = productRepository;
  }
}
