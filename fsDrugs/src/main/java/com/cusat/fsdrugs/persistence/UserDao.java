package com.cusat.fsdrugs.persistence;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cusat.fsdrugs.model.User;

public interface UserDao extends JpaRepository<User,BigInteger>{

}
