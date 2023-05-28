package org.simplilearn.app.dao;

import java.util.List;

import org.simplilearn.app.entities.Emp;

public interface EmpDao {

	List<Emp> getAll();
	Emp getByName(String name);
	void update(Emp e,int eno);
	void delete(int eno);
}
