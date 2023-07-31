package com.zerobase.auction.data.dao.Impl;

import com.zerobase.auction.data.dao.UserDao;
import com.zerobase.auction.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl implements UserDao {
  private final UserRepository userRepository;

  @Autowired
  UserDaoImpl(UserRepository userRepository){
    this.userRepository = userRepository;
  }
}
