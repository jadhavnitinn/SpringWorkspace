package com.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcDemo {

	private JdbcTemplate jt;
	

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int saveEmp(Emp e) {
		//"+e.getId()+","+e.getFirstName()+","+e.getLastName()+","+e.getSalary()+"
		int i= jt.update("insert into emp values('"+e.getId()+"','"+e.getFirstName()+"','"+e.getLastName()+"','"+e.getSalary()+"')");
		return i;
	}

}
