package com.assign.jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assign.jpa.entity.Customer;
import com.assign.jpa.entity.Purchase;
import com.assign.jpa.repository.CustomerRepository;
import com.assign.jpa.repository.PurchaseRepository;
import com.assign.jpa.temp.OrderRequest;

@RestController
public class OrderController {
	@Autowired
	private CustomerRepository customerrepo;
	@Autowired
	private PurchaseRepository productrepo;
	
	@PostMapping("/placeOrder")
    public Customer placeOrder(Customer customer){
        customerrepo.save(customer);
        return customer;
    }
	@PostMapping("/purchase")
    public Purchase purchase(Purchase purchase){
        productrepo.save(purchase);
        return purchase;
    }

	
	 @GetMapping("/findAllOrders")
	    public List<Customer> findAllOrders(){
	        return customerrepo.findAll();
	    }
   
}
