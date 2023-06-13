package com.jdbc.service;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.beans.Customer;

public class CustomerServiceImpl implements CustomerService {

	private JdbcTemplate jdbc;
	private DataSource ds;

	public DataSource getDs() {
		return ds;
	}

	public void setDs(DataSource ds) {
		System.out.println("Db Connected");
		this.ds = ds;
		jdbc = new JdbcTemplate(this.getDs());
	}

	public String AddCustomer(Customer cus) {
		String result = "error";
		String inscmd = "Insert into Customer(custname, email, phone) values(?,?,?)";
		int res = jdbc.update(inscmd, new Object[] { cus.getCustname(), cus.getEmail(), cus.getPhone() });
		if (res >= 1)
			result = "Success";
		return result;
	}

	public List<Customer> ShowAll() {
		List<Customer> custall = jdbc.query("Select * from Customer", new BeanPropertyRowMapper(Customer.class));
		return custall;
	}

	public Customer SearchCustomer(int cno) {
		Customer cust = null;
		try {
			String sqlcmd = "Select * from Customer where custid=?";
			cust = jdbc.queryForObject(sqlcmd, new Object[] { cno }, new BeanPropertyRowMapper(Customer.class));
		} catch (Exception ex) {
			cust = null;
		}
		return cust;
	}

	public String ModifyCustomer(Customer cus) {
		String result = "error";
		String uptcmd = "Update Customer set custname=? where custid=?";
		int res = jdbc.update(uptcmd, new Object[] { cus.getCustname(), cus.getCustid() });
		if (res >= 1)
			result = "Success";
		return result;
	}

	public String DeleteCustomer(int cno) {
		String result = "error";
		String delcmd = "Delete from Customer where custid=?";
		int res = jdbc.update(delcmd, new Object[] { cno });
		if (res >= 1)
			result = "Success";
		return result;
	}

}
