package com.yash.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.yash.entity.Customer;
import com.yash.services.CustServices;
import com.yash.services.ProdServices;
@RestController
@RequestMapping("/mapping")
public class ControllerClass {
	@Autowired
	private ProdServices prodServices;
	@Autowired
	private CustServices custServices;
	@PostMapping("/customerData")
	public ResponseEntity<?> insertData(@RequestBody Customer customer) {
		System.out.println("------- " + customer);
		custServices.saveData(customer);
		return ResponseEntity.ok("successFull inserted");
	}
	@GetMapping("/getData")
	public List<Customer> findallData(){
		return custServices.findallData();
	}
}
