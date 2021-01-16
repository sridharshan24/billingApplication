package com.billingApplicationBE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.billingApplicationBE.modal.Customer;
import com.billingApplicationBE.service.BillingService;

@RestController
public class BillingController {
	
	@Autowired
	BillingService billingService;

	@RequestMapping(value = "/saveBill", method = RequestMethod.POST)
	public String saveBillDetails(@RequestBody Customer customer)
	{
		System.out.println(customer.getDiscountFlag());
		System.out.println(customer.getPurchaseDate());
		Customer cust = billingService.saveBillDetails(customer);
		String response = "";
		if(cust != null)
		{
			response = "Successfully saved";
		}
		else
		{
			response = "Failed saving";
		}
		
		return response;
	}
}
