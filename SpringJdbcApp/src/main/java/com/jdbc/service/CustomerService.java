package com.jdbc.service;

import java.util.List;

import com.jdbc.beans.Customer;

public interface CustomerService {
	public String AddCustomer(Customer cus);
	public List<Customer>  ShowAll();
	public Customer SearchCustomer(int cno);
	public String ModifyCustomer(Customer cus);
	public String DeleteCustomer(int cno);
}

