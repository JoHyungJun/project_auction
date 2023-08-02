package com.zerobase.auction.service;

import com.zerobase.auction.data.dto.ProductDto;
import java.util.List;

public interface ProductService {

  ProductDto getProduct(Long id);

  List<ProductDto> getAllProducts();

  List<ProductDto> getProductsByCategory(String category);

  List<ProductDto> getProductsByName(String name);

  List<ProductDto> getProductsByDate();
  // date 처리 방법을 몰라 나중에 구현 예정

  ProductDto saveProduct(Long providerId, String name, Long price, String category, String explanation);

  ProductDto updateProduct(Long id, String name, String category, String explanation);

  void deleteProvideProduct(Long id);

  void deleteConsumeProduct(Long id);
}
