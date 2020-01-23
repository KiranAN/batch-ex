package com.javainuse;

import org.springframework.batch.item.ItemProcessor;

import com.javainuse.model.Employee;

public class CustomEmployeeProcessor implements
		ItemProcessor<Employee, Employee> {

	@Override
	public Employee process(Employee employee) throws Exception {
		 if (employee != null && employee.getEmployeeId().contains("footer")) {
			 	System.out.println("footer");
	            return null;
	      }else {
	    	 System.out.println(employee.getEmployeeId()+""+","+employee.getEmployeeName());		
	  		return employee;
	      }
		
	}

}