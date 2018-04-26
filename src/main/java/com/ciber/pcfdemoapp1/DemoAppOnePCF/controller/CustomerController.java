package com.ciber.pcfdemoapp1.DemoAppOnePCF.controller;

import com.ciber.pcfdemoapp1.DemoAppOnePCF.DAO.CustomerDAO;
import com.ciber.pcfdemoapp1.DemoAppOnePCF.Entity.Customer;
import com.ciber.pcfdemoapp1.DemoAppOnePCF.Entity.CustomerAddress;
import com.ciber.pcfdemoapp1.DemoAppOnePCF.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {

  @Autowired
  CustomerService customerService;

  @GetMapping("/customers")
  public List<Customer> getCustomers() {

    return customerService.getAllCustomers();
  }

}
