package com.billingApplicationBE.dao;

import org.springframework.data.repository.CrudRepository;

import com.billingApplicationBE.modal.Customer;

public interface BillingRepository extends CrudRepository<Customer, Integer> {

}
