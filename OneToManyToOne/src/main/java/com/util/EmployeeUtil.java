package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bean.Department;
import com.bean.Employee;

public class EmployeeUtil {
	
	public static Session createSession() {
		
	SessionFactory sf=new Configuration()
				         .addAnnotatedClass(Department.class)
				         .addAnnotatedClass(Employee.class)
				         .configure()
				         .buildSessionFactory();
		
		Session session=sf.openSession();
		  return session;
	}

}
