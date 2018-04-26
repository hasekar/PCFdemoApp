package com.ciber.pcfdemoapp1.DemoAppOnePCF.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Customer {

  @Id @GeneratedValue
  private int ID;
  private String FIRST_NAME;
  private String LAST_NAME;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "customer")
  private Set<CustomerAddress> customerAddress = new HashSet<>();

  public Customer(String FIRST_NAME, String LAST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
    this.LAST_NAME = LAST_NAME;
  }

  public Customer() {
  }

  public int getID() {
    return ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getFIRST_NAME() {
    return FIRST_NAME;
  }

  public void setFIRST_NAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }

  public String getLAST_NAME() {
    return LAST_NAME;
  }

  public void setLAST_NAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }

  public Set<CustomerAddress> getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(Set<CustomerAddress> customerAddress) {
    this.customerAddress = customerAddress;
  }
}
