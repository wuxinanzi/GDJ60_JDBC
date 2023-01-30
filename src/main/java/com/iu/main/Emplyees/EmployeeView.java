package com.iu.main.Emplyees;

public class EmployeeView {

	public void view(String msg) {
		System.out.println(msg);
	}
	
	public void view(EmployeeDTO employeeDTO) {
		System.out.println(employeeDTO.getEmployee_id());
		
	}
}
