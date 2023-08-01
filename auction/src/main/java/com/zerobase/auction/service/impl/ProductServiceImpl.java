package com.zerobase.auction.service.impl;

import com.zerobase.auction.data.dto.ProductDto;
import com.zerobase.auction.data.repository.ProductRepository;
import com.zerobase.auction.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  @Autowired
  ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  public ProductDto getProduct(Long id) {
    return null;
  }

  @Override
  public List<ProductDto> getAllProducts(Long id) {
    return null;
  }


  @Override
  public List<ProductDto> getProvideProducts(Long id) {
    return null;
  }

  @Override
  public List<ProductDto> getConsumeProducts(Long id) {
    return null;
  }

  @Override
  public List<ProductDto> getProductsByCategory(String category) {
    return null;
  }

  @Override
  public List<ProductDto> getProductsByName(String name) {
    return null;
  }

  @Override
  public List<ProductDto> getProductsByDate() {
    return null;
  }

  @Override
  public ProductDto saveProduct() {
    return null;
  }

  @Override
  public ProductDto updateProduct(String name, String category, String explanation) {
    return null;
  }

  @Override
  public void deleteProvideProduct(Long id) {

  }

  @Override
  public void deleteConsumeProduct(Long id) {

  }
}
