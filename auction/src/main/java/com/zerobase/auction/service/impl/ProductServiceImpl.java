package com.zerobase.auction.service.impl;

import com.zerobase.auction.data.dto.ProductDto;
import com.zerobase.auction.data.entity.Product;
import com.zerobase.auction.data.repository.ProductRepository;
import com.zerobase.auction.service.ProductService;
import com.zerobase.auction.type.ProductStatus;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  @Autowired
  ProductServiceImpl(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  @Override
  @Transactional
  public ProductDto getProduct(Long id) {
    return ProductDto.fromEntity(productRepository.findById(id).get());
    // 없을 시 optional로 exception 발생 구현 예정
  }

  @Override
  @Transactional
  public List<ProductDto> getAllProducts() {
    return productRepository.findAll().stream().map(product -> ProductDto.fromEntity(product))
        .collect(Collectors.toList());
  }

  @Override
  @Transactional
  public List<ProductDto> getProductsByCategory(String category) {
    return productRepository.findAllByCategory(category).stream()
        .map(product -> ProductDto.fromEntity(product)).collect(
            Collectors.toList());
  }

  @Override
  @Transactional
  public List<ProductDto> getProductsByName(String name) {
    return productRepository.findAllByName(name).stream()
        .map(product -> ProductDto.fromEntity(product)).collect(
            Collectors.toList());
  }

  // 추후 구혀 예정 (아직 DATE 세팅을 못 함)
  @Override
  @Transactional
  public List<ProductDto> getProductsByDate() {
    return null;
  }

  @Override
  @Transactional
  public ProductDto saveProduct(Long providerId, String name, Long price, String category, String explanation) {
    return ProductDto.fromEntity(
        productRepository.save(
            Product.builder()
                .id(0l)  // IDENTITY라서 아무 값이나 넣음. 괜찮나?
                .providerId(providerId)
                .name(name)
                .price(price)
                .category(category)
                .explanation(explanation)
                .status(ProductStatus.ON_SALE.toString())
                .build()
        )
    );
  }
  
  // 업데이트 기능 구현 예정
  @Override
  @Transactional
  public ProductDto updateProduct(Long id, String name, String category, String explanation) {
    Product product = productRepository.findById(id).get();
    // 추후 optional로 갑 없으면 에러 발생 기능 구현 예정
    
    return null;
  }

  // 업데이트 기능 구현 예정
  @Override
  @Transactional
  public void deleteProvideProduct(Long id) {

  }

  // 업데이트 기능 구현 예정
  @Override
  @Transactional
  public void deleteConsumeProduct(Long id) {

  }
}
