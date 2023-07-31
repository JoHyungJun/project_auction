package com.zerobase.auction.data.dto;

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
}
