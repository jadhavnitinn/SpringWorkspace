package com.dao;

public class EmpBean {

	EmpDao dao;

	public void setDao(EmpDao dao) {
		this.dao = dao;
	}

	public void save(Emp e) {
		System.out.println(e.getFirstName());
		dao.SaveEmp(e);
	}

	public void ViewAll() {
		dao.AllEmp();
	}

}
