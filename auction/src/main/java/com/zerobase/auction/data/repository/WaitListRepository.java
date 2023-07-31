package com.zerobase.auction.data.repository;

import com.zerobase.auction.data.entity.WaitList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaitListRepository extends JpaRepository<WaitList, Long> {

}
