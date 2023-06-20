package com.cjc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cjc.model.Customer;

public class CustomerDao {

	private JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void saveCustomer(Customer customer) {

		String insert = "insert into Customer values(" + customer.getCid() + "," + "'" + customer.getCname() + "',"
				+ "'" + customer.getCproduct() + "'," + "'" + customer.getCaddress() + "')";

		template.update(insert);
		System.out.println("Inserted :" + insert);

	}

	public void updateCustomer(Customer customer) {
					
		String update = "update Customer " + "set cname='" + customer.getCname() + "" + "',cproduct='"
				+ customer.getCproduct() + "'," + "caddress='" + customer.getCaddress() + "'" + "where cid="
				+ customer.getCid() + "";

		template.update(update);
		System.out.println("Updated");
	}

	public void deleteCustomer(Customer customer) {

		String delete = "delete from Customer where cid=" + customer.getCid() + "";

		template.update(delete);
		System.out.println("deleted");
	}

	public void deleteAllCustomer() {
		
		String deleteAll="delete from Customer";
		
		template.update(deleteAll);
		System.out.println("Deleted");
		
	}

}
