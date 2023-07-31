package com.zerobase.auction.data.repository;

import com.zerobase.auction.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
