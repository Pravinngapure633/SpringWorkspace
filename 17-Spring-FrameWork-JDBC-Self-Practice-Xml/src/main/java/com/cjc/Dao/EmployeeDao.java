package com.cjc.Dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.cjc.model.Employee;

public class EmployeeDao {
	
	private JdbcTemplate template;
	
	
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public void saveEmployeeDetail(Employee emp) {
		String insert="insert into Employee values("+emp.getId()+",'"+emp.getName()+"','"+emp.getAddress()+"','"+emp.getDesig()+"',"+emp.getSalary()+")";
		
		template.update(insert);
		System.out.println("Inserted");
	}

	public void updateEmployeeDetail(Employee emp) {
		String update="update Employee set name='"+emp.getName()+"',address='"+emp.getAddress()+"',salary="+emp.getSalary()+" where id="+emp.getId()+"";
	
		template.update(update);
		System.out.println("Updated");
	}

	public void deleteEmployeeDetail(Employee emp) {
		String delete="delete from employee where id="+emp.getId()+"";
		template.update(delete);
		System.out.println("Deleted");
	}

}
