package com.zerobase.auction.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Product")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private Long providerId;

  @Column(nullable = false)
  private String name;

  @Column(nullable = false)
  private Long price;

  @Column(nullable = false)
  private String category;

  @Column(nullable = false)
  private String explanation;

  @Column(nullable = false)
  private String status;
}
