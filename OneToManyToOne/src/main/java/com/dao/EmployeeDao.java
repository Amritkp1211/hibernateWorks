package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Department;
import com.bean.Employee;
import com.util.EmployeeUtil;

public class EmployeeDao {

	 public static void insertDepartment(Department d)
	 {
		 Session session=EmployeeUtil.createSession();
		 Transaction tr=session.beginTransaction();
		 session.save(d);
		 tr.commit();
		 session.close();
	 }
	 
	 public static void insertEmployee(Employee e)
	 {
		 Session session=EmployeeUtil.createSession();
		 Transaction tr=session.beginTransaction();
		 session.save(e);
		 tr.commit();
		 session.close();
	 }
	 
	 public static List<Department> getAllDept()
	 {
		 Session session=EmployeeUtil.createSession();
		 List<Department> list=session.createQuery("from Department").list();
		 session.close();
		 return list;
	 }
	 
	 public static Department getDepartment(int did)
	 {
		 Session session=EmployeeUtil.createSession();
		 Department d=session.get(Department.class, did);
		 session.close();
		 return d;
		 
	 }
}
