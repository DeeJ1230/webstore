package com.packt.webstore.repository;

import java.util.List;

import com.packt.webstore.domain.Customer;

public interface ICustomerRepository {
	List<Customer> getAllCustomers();
}
