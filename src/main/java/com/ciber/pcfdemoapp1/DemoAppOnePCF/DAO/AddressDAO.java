package com.ciber.pcfdemoapp1.DemoAppOnePCF.DAO;

import com.ciber.pcfdemoapp1.DemoAppOnePCF.Entity.CustomerAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressDAO extends JpaRepository<CustomerAddress, Integer> {
}
