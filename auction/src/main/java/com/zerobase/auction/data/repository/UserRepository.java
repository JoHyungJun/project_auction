package com.zerobase.auction.data.repository;

import com.zerobase.auction.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
