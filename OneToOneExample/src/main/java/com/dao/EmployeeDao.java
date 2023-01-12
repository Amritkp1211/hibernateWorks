package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bean.Employee;
import com.bean.EmployeePI;
import com.util.EmployeeUtil;

public class EmployeeDao {

	
	 public static void insertEmployeePI(EmployeePI epid)
	 {
		 Session session=EmployeeUtil.createSession();
		 Transaction tr=session.beginTransaction();
		 session.save(epid);
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
	 
	 public static List<Employee> showEmployee()
	 {
		 Session session=EmployeeUtil.createSession();
		 List<Employee> list=session.createQuery("from Employee").list();
		 session.close();
		 return list;
		 
		 
	 }
}
