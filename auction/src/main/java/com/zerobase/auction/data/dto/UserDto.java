package com.zerobase.auction.data.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class UserDto {

  private Long id;
  private String userId;
  private Double latitude;
  private Double longitude;
  private String role;
}
