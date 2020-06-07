package com.employeeinfo.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.employeeinfo.dao.EmployeeDao;
import com.employeeinfo.dao.EmployeeDaoImpl;
import com.employeeinfo.model.Employee;

/**
 * Servlet implementation class EmployeeController
 */
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	RequestDispatcher dispatcher = null;
	EmployeeDao employeeDao = new EmployeeDaoImpl();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		listEmployee(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		showEmployee(request, response);
		
	}
	
	
	private void listEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		List<Employee> employees = employeeDao.getAllEmployees();
		
		request.setAttribute("list", employees);
		
		dispatcher = request.getRequestDispatcher("/views/employee-index.jsp");
		
		dispatcher.forward(request, response);
	}
	
	private void showEmployee(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		String manNo = request.getParameter("manNo");

		//---------------------------------Displaying input on Console-----------------------------------------------------
		System.out.println("The Man No entered is: " + manNo);	
		//-----------------------------------------------------------------------------------------------------------------
	    
		// Get employee from storage (EmployeeDaoImpl class) and store in the employee object
		Employee theEmployee = employeeDao.getEmployee(Integer.parseInt(manNo));
		
		// sent data to employee-show.jsp
		request.setAttribute("employee", theEmployee);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("employee-show.jsp");
		
		dispatcher.forward(request, response);
	}
	

}
