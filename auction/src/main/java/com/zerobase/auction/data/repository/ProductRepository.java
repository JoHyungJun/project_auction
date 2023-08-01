package com.zerobase.auction.data.repository;

import com.zerobase.auction.data.entity.Product;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

  Optional<Product> findById(Long id);

  List<Product> findAll();

  List<Product> findAllByProviderId(Long id);

  List<Product> findAllByCategory(String category);

  List<Product> findAllByName(String name);


}
