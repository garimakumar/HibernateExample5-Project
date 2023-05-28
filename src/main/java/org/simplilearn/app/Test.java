package org.simplilearn.app;

import org.simplilearn.app.dao.EmpDao;
import org.simplilearn.app.dao.EmpDaoImpl;
import org.simplilearn.app.entities.Emp;

public class Test {

	public static void main(String[] args) {

		EmpDao dao=new EmpDaoImpl();
        dao.delete(2);
	}

}
