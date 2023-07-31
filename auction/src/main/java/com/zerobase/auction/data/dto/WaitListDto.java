package com.zerobase.auction.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class WaitListDto {

  private Long id;
  private Long productId;
  private Long consumerId;
  private Long sequenceNum;
  private Long priceConsumer;
  private Long priceProvider;
}
