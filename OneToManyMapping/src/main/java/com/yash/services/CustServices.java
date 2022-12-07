package com.yash.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.Repository.CustomerRepo;
import com.yash.entity.Customer;

@Service
public class CustServices {

	@Autowired
	private CustomerRepo customerRepo;

	public void saveData(Customer customer) {
		customerRepo.save(customer);

	}

	public List<Customer> findallData() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}
}
