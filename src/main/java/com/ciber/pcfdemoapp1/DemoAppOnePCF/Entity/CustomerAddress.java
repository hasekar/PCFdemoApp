package com.ciber.pcfdemoapp1.DemoAppOnePCF.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class CustomerAddress {

  @Id @GeneratedValue
  private int ID;
  private String STREET_ADDRESS;
  private String COUNTRY;
  private String ZIPCODE;

  @JsonIgnore @ManyToOne
  private Customer customer;

  public CustomerAddress() {
  }

  public CustomerAddress(String STREET_ADDRESS, String COUNTRY, String ZIPCODE, Customer customer) {
    this.STREET_ADDRESS = STREET_ADDRESS;
    this.COUNTRY = COUNTRY;
    this.ZIPCODE = ZIPCODE;
    this.customer = customer;
  }

  public String getSTREET() {
    return STREET_ADDRESS;
  }

  public void setSTREET(String STREET) {
    this.STREET_ADDRESS = STREET;
  }

  public String getCOUNTRY() {
    return COUNTRY;
  }

  public void setCOUNTRY(String COUNTRY) {
    this.COUNTRY = COUNTRY;
  }

  public String getZIPCODE() {
    return ZIPCODE;
  }

  public void setZIPCODE(String ZIPCODE) {
    this.ZIPCODE = ZIPCODE;
  }
}
