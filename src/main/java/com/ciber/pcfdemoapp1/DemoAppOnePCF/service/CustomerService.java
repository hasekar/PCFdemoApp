package com.ciber.pcfdemoapp1.DemoAppOnePCF.service;

import com.ciber.pcfdemoapp1.DemoAppOnePCF.DAO.CustomerDAO;
import com.ciber.pcfdemoapp1.DemoAppOnePCF.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

  @Autowired
  CustomerDAO customerDAO;

  public List<Customer> getAllCustomers() {
    return customerDAO.findAll();
  }
}
