package com.jdbc.apps;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.beans.Customer;
import com.jdbc.service.CustomerService;

public class CustomerMain {

	public static void main(String[] args) {

		ApplicationContext factory = new ClassPathXmlApplicationContext("configdb.xml");

		// interface dependency injection
		CustomerService cs = (CustomerService) factory.getBean("cusObj");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println(
					"1. Add New Customer\n2. Show All Customers\n3. Search Customer\n4. Update Customer Name\n5. Delete Customer\n6. Exit");
			System.out.println("Pick Ur Choice : ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				Customer c = new Customer();
				System.out.println("Customer Name : ");
				c.setCustname(sc.next());
				System.out.println("Email ID : ");
				c.setEmail(sc.next());
				System.out.println("Phone Number : ");
				c.setPhone(sc.next());

				if (cs.AddCustomer(c).equals("Success"))
					System.out.println("Customer is Added...");
				else
					System.out.println("Error ! Customer is Not Added...");
				break;
			case 2:
				List<Customer> call = cs.ShowAll();

				for (Customer c1 : call) {
					System.out.println(
							c1.getCustid() + "\t" + c1.getCustname() + "\t" + c1.getEmail() + "\t" + c1.getPhone());
				}
				break;

			case 3:
				System.out.println("Enter Customer ID : ");
				int cno = sc.nextInt();

				Customer cust = cs.SearchCustomer(cno);

				if (cust != null)
					System.out.println(cust.getCustid() + "\t" + cust.getCustname() + "\t" + cust.getEmail() + "\t"
							+ cust.getPhone());
				else
					System.out.println("Customer Not Found...");
				break;
			case 4:
				System.out.println("Enter Customer ID : ");
				cno = sc.nextInt();

				cust = cs.SearchCustomer(cno);

				if (cust != null) {
					System.out.println("Present Name of the customer : " + cust.getCustname());
					System.out.println("Enter New Name of Customer ");
					cust.setCustname(sc.next());

					if (cs.ModifyCustomer(cust).equals("Success"))
						System.out.println("Customer is Updated");
					else
						System.out.println("Customer is Not Updated");
				} else
					System.out.println("Customer Not Found...");
				break;
			case 5:
				System.out.println("Enter Customer ID : ");
				cno = sc.nextInt();

				cust = cs.SearchCustomer(cno);

				if (cust != null) {
					if (cs.DeleteCustomer(cno).equals("Success"))
						System.out.println("Customer is Deleted");
					else
						System.out.println("Customer is Not Deleted");
				} else
					System.out.println("Customer Not Found...");
				break;
			case 6:
				System.out.println("Thanks for Using App");
				System.exit(0);
			}
		}

	}
}
