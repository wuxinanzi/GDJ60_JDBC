package com.iu.main.departments;

import java.util.ArrayList;

import com.iu.main.Emplyees.EmployeeDTO;

public class DepartmentDTO{
	//DTO 데이터 전송
	//모든 멤버변수의 접근지정자는 private
	//멤버변수의 데이터타입과 변수명은
	//Table의 컬러의 데이터타입과 컬럼명과 일치 시킴
	//Getter/Setter 생성
	//생성자는 여러개 있어도 상관 x
	private Integer department_id;
	private String departmnet_name;
	private Integer manager_id;
	private Integer location_id;
	
	private ArrayList<EmployeeDTO> employeeDTOs;
	
	
	
	public ArrayList<EmployeeDTO> getEmployeeDTOs() {
		return employeeDTOs;
	}
	public void setEmployeeDTOs(ArrayList<EmployeeDTO> employeeDTOs) {
		this.employeeDTOs = employeeDTOs;
	}
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public String getDepartmnet_name() {
		return departmnet_name;
	}
	public void setDepartmnet_name(String departmnet_name) {
		this.departmnet_name = departmnet_name;
	}
	public Integer getManager_id() {
		return manager_id;
	}
	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}
	public Integer getLocation_id() {
		return location_id;
	}
	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}
	public Object getDepartment_name() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setDepartment_name(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
