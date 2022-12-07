package com.yash.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.Repository.ProductRepo;
import com.yash.entity.Customer;
import com.yash.entity.Product;

@Service
public class ProdServices {

	@Autowired
	private ProductRepo productRepo;

	public void saveData(Product product) {
		productRepo.save(product);

	}

}
