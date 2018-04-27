package com.ciber.pcfdemoapp1.DemoAppOnePCF.controller;

import com.ciber.pcfdemoapp1.DemoAppOnePCF.Entity.Customer;
import com.ciber.pcfdemoapp1.DemoAppOnePCF.Entity.CustomerAddress;
import com.ciber.pcfdemoapp1.DemoAppOnePCF.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Arrays;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(CustomerController.class)
public class CustomerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    CustomerService customerService;


    @Test
    public void getCustomers() throws Exception {

//      Customer customer1 = new Customer("Harish","Sekar");
//      CustomerAddress customerAddress = new CustomerAddress("xyz","sdf","asdf",customer1);

      when(customerService.getAllCustomers()).thenReturn(Arrays.asList(customer1));

      RequestBuilder request = MockMvcRequestBuilders
              .get("/customers")
              .accept(MediaType.APPLICATION_JSON);

      mockMvc.perform(request)
              .andExpect(status().isOk())
              .andExpect(content().json("[{\"customerAddress\":[{\"street\":\"xyz\",\"country\":\"sdf\",\"zipcode\":\"asdf\"}],\"id\":1,\"first_NAME\":\"Harish\",\"last_NAME\":\"Sekar\"}]"))
              .andReturn();
    }

}
