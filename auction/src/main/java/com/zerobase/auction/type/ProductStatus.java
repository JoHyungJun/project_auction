package com.zerobase.auction.type;

public enum ProductStatus {
  ON_SALE {
    @Override
    public String toString() {
      return "ON_SALE";
    }
  },
  SOLD_OUT {
    @Override
    public String toString() {
      return "SOLD_OUT";
    }
  }
}
