package com.ciber.pcfdemoapp1.DemoAppOnePCF;

import com.ciber.pcfdemoapp1.DemoAppOnePCF.DAO.AddressDAO;
import com.ciber.pcfdemoapp1.DemoAppOnePCF.DAO.CustomerDAO;
import com.ciber.pcfdemoapp1.DemoAppOnePCF.Entity.Customer;
import com.ciber.pcfdemoapp1.DemoAppOnePCF.Entity.CustomerAddress;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class DemoAppOnePcfApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoAppOnePcfApplication.class, args);
	}


	@Bean
	CommandLineRunner init(CustomerDAO customerDAO, AddressDAO customerAddressDAO ) {
		return (evt) -> Arrays.asList(
						"jhoeller,dsyer,pwebb".split(","))
						.forEach(
										a -> {
											Customer customer1 = customerDAO.save(new Customer("Harish","Sekar"));
											CustomerAddress customerAddress = customerAddressDAO.save(new CustomerAddress("xyz","sdf","asdf",customer1));
											//											Account account = accountRepository.save(new Account(a,
//															"password"));
//											bookmarkRepository.save(new Bookmark(account,
//															"http://bookmark.com/1/" + a, "A description"));
//											bookmarkRepository.save(new Bookmark(account,
//															"http://bookmark.com/2/" + a, "A description"));
										});
	}
}
