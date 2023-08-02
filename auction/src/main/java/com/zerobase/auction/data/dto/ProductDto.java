package com.zerobase.auction.data.dto;

import com.zerobase.auction.data.entity.Product;
import javax.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ProductDto {

  private Long id;
  private Long providerId;
  private String name;
  private Long price;
  private String category;
  private String explanation;
  private String status;

  public static ProductDto fromEntity(Product product) {
    return ProductDto.builder()
        .id(product.getId())
        .providerId(product.getProviderId())
        .name(product.getName())
        .price(product.getPrice())
        .category(product.getCategory())
        .explanation(product.getExplanation())
        .status(product.getStatus())
        .build();
  }
}
