package com.yash.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.entity.Customer;

public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
