package com.zerobase.auction.data.dao.Impl;

import com.zerobase.auction.data.dao.WaitListDao;
import com.zerobase.auction.data.repository.WaitListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WaitListDaoImpl implements WaitListDao {
  private final WaitListRepository waitListRepository;

  @Autowired
  WaitListDaoImpl(WaitListRepository waitListRepository){
    this.waitListRepository = waitListRepository;
  }

}
