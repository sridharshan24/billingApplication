package com.billingApplicationBE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.billingApplicationBE.dao.BillingRepository;
import com.billingApplicationBE.modal.Customer;

@Service
public class BillingService {
	
	@Autowired
	BillingRepository billingRepo;
	
	public Customer saveBillDetails(Customer customer)
	{
		return billingRepo.save(customer);
	}

}
