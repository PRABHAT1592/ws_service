package com.cusat.fsdrugs.persistence;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cusat.fsdrugs.model.Order;

public interface OrderDao extends JpaRepository<Order,BigInteger>{

}
