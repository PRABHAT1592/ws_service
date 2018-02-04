package com.cusat.fsdrugs.persistence;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cusat.fsdrugs.model.Address;

public interface AddressDao  extends JpaRepository<Address,BigInteger>	{

}
