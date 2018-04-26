package com.ciber.pcfdemoapp1.DemoAppOnePCF.DAO;

import com.ciber.pcfdemoapp1.DemoAppOnePCF.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerDAO extends JpaRepository <Customer, Integer> {
   List<Customer> findAll();
}
