package com.packt.webstore.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;

@Repository
public class InMemoryCustomerRepository implements ICustomerRepository {

	private List<Customer> listOfCustomers = new ArrayList<>();
	
	@Override
	public List<Customer> getAllCustomers() {
		Customer customer = new Customer();
		customer.setCustomerId("C1234");
		customer.setName("Dan");
		customer.setAddress("Fuglevangsvej");
		listOfCustomers.add(customer);
		
		return listOfCustomers;
	}

}
