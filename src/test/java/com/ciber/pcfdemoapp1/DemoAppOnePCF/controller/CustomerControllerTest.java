package com.ciber.pcfdemoapp1.DemoAppOnePCF.controller;

import com.ciber.pcfdemoapp1.DemoAppOnePCF.Entity.Customer;
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

      when(customerService.getAllCustomers()).thenReturn(Arrays.asList(new Customer()));

      RequestBuilder request = MockMvcRequestBuilders
              .get("/customers")
              .accept(MediaType.APPLICATION_JSON);

      mockMvc.perform(request)
              .andExpect(status().isOk())
              .andExpect(content().json("[{\"customerAddress\":null,\"id\":0,\"first_NAME\":null,\"last_NAME\":null}]"))
              .andReturn();
    }

}
