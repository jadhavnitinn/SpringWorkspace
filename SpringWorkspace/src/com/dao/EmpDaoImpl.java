package com.dao;

import java.util.Iterator;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDaoImpl implements EmpDao {

	private JdbcTemplate jt;

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int SaveEmp(Emp e) {
		int id=e.getId();
		String fn=e.getFirstName();
		String ln=e.getLastName();
		double sal=e.getSalary();
		
		Object p[]={id,fn,ln,sal};

		int i = jt.update("insert into emp values(?,?,?,?)",p);
		System.out.println("Success..."+i);
		return i;
		
	}

	
	public void AllEmp() {
	
		List l=jt.queryForList("select * from emp");
		Iterator iterator=l.iterator();
		while (iterator.hasNext()) {
			Emp mm = (Emp) iterator.next();
			System.out.println(mm.getId()+"  "+mm.getFirstName()+"  "+mm.getLastName()+"  "+mm.getSalary());
		}
		
	}

}
