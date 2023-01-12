package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Department;
import com.bean.Employee;
import com.dao.EmployeeDao;

public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert dept"))
		{
			Department d=new Department();
			d.setDname(request.getParameter("dname"));
			d.setLocation(request.getParameter("location"));
			
			EmployeeDao.insertDepartment(d);
				
		}
		else if(action.equalsIgnoreCase("insert emp"))
		{
			int did=Integer.parseInt(request.getParameter("dept"));
			Department d=EmployeeDao.getDepartment(did);
			Employee e=new Employee();
			e.setFname(request.getParameter("fname"));
			e.setLname(request.getParameter("lname"));
			e.setUname(request.getParameter("uname"));
			e.setDept(d);
			EmployeeDao.insertEmployee(e);
		     
			response.sendRedirect("emp.jsp");
		}
		
	}

}
