package com.iu.main.departments;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.main.Emplyees.EmployeeDTO;
import com.iu.main.util.DBConnection;

public class DepartmentDAO {
	
	public void getInfos()throws Exception{
		//30번 부서명 
		Connection con = DBConnection.getConnection();
		
		String sql ="SELECT E.FIRST_NAME,D.DEPARTMENT_NAME"
				+ "FROM EMPLOYEES E"
				+ "INNER JOIN"
				+ "DEPARTMENTS D"
				+ "ON (E.DEPARTMENT_ID + D.DEPARTMENT_ID"
				+ "WHERE D.DEPARTMENT_ID+30";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setEmployeeDTOs(new ArrayList<EmployeeDTO>());
		while(rs.next()) {
			if(departmentDTO.getDepartmnet_name()== null) {
				departmentDTO.setDepartmnet_name(rs.getString("DEPARTMENT_NAME"));
			}
			departmentDTO.setDepartmnet_name(rs.getString("DEPARTMENT_NAME"));
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setFirst_name(rs.getString("FIRST_NAME"));
			departmentDTO.getEmployeeDTOs().add(employeeDTO);
			                 	
			
		}
		
	}
	
	//join
	public DepartmentDTO getInfo()throws Exception{
		
		DepartmentDTO departmentDTO = new DepartmentDTO();
		Connection con = DBConnection.getConnection();
		
		String sql="SELECT E.FIRST_NAME, D.DEPARTMENT_NAME"
				+ "FORM EMPLOYEES E "
				+ "INNER JOIN "
				+ "DEPARTMENTS D"
				+ "ON(E.DEPARTMENT_ID=D.DEPARTMENT_ID)"
				+ "WHERE E.EMPLOYEE_ID = 100";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			departmentDTO = new DepartmentDTO();
			departmentDTO.setEmployeeDTOs(new ArrayList<EmployeeDTO>());
			departmentDTO.setDepartmnet_name(rs.getString("DEPARTMENT_NAME"));
			departmentDTO.getEmployeeDTOs().get(0).setFirst_name(rs.getString(0));
			EmployeeDTO employeeDTO = new EmployeeDTO();
			employeeDTO.setFirst_name(rs.getString("FIRST_NAME"));
			departmentDTO.getEmployeeDTOs().add(employeeDTO);
			
		}
		return departmentDTO;
	}
	
	//update
	public int updateData(DepartmentDTO departmentDTO) throws Exception{
		Connection con = DBConnection.getConnection();
		
		String sql = "UPDATE DEPARTMENTS SET DEPARTMENT_NAME=?, MNAGET_ID=?,LOVATION_ID=?"
			+"WHERE DEPARTMENT_ID=?";
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, departmentDTO.getDepartmnet_name());
		st.setInt(2, departmentDTO.getDepartment_id());
		st.setInt(3, departmentDTO.getLocation_id());
		st.setInt(4, departmentDTO.getDepartment_id());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, con);
		
		return result;
		
	}
	//delete
	public int deleteData(DepartmentDTO departmentDTO) throws Exception{
		
		Connection connection = DBConnection.getConnection();
		String sql = "DELETE DEPARTMENTS WHERE DEPARTMENT_ID=?";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setInt(1, departmentDTO.getDepartment_id());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, connection);
		
		return result;
	}
	
	
	
	//insert
	public int setData(DepartmentDTO departmentDTO) throws Exception {
		
		Connection con = DBConnection.getConnection();
		
		String sql ="INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID)"
				+" VALUES (DEPARTMENTS_SEQ.NEXTVAL, ?, ?, ?)";
		
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1, departmentDTO.getDepartmnet_name());
		st.setInt(2, departmentDTO.getManager_id());
		st.setInt(3, departmentDTO.getLocation_id());
		
		int result = st.executeUpdate();
		
		DBConnection.disConnect(st, con);
		
		return result;
	}
	
	
	public  ArrayList<DepartmentDTO> getList() throws Exception{
		ArrayList<DepartmentDTO> ar = new ArrayList<DepartmentDTO>();
		
		Connection connection = DBConnection.getConnection();
		String sql ="SELECT * FROM DEPARTMENTS";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		
		ResultSet rs = st.executeQuery();
		while(rs.next()) {
			DepartmentDTO departmentDIO = new DepartmentDTO();
			
			departmentDIO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			departmentDIO.setDepartmnet_name(rs.getString("DEPARTMENT_NAME"));
			departmentDIO.setManager_id(rs.getInt("MANAGER_ID"));
			departmentDIO.setLocation_id(rs.getInt("LOCATION_ID"));
			ar.add(departmentDIO);
			
		}
		
		DBConnection.disConnect(rs, st, connection);
	
		return ar;
	}
	
	
	public DepartmentDTO getDeTail(int LOCATION_ID) throws Exception{
		
		DepartmentDTO departmentDTO = null;
		
		Connection connection = DBConnection.getConnection();
		
		
		String sql = "SELECT * FROM LOCATIONS WHERE LOCATION_ID = ?";
		
		PreparedStatement st = connection.prepareStatement(sql);
		
		st.setInt(1, LOCATION_ID);
		
		ResultSet rs = st.executeQuery();
		
		if(rs.next()) {
			departmentDTO = new DepartmentDTO();
			
			departmentDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			departmentDTO.setDepartmnet_name(rs.getString("DEPARTMENT_NAME"));
			departmentDTO.setManager_id(rs.getInt("MANAGER_ID"));
			departmentDTO.setLocation_id(rs.getInt("LOCATION_ID"));
			
		}else {
			System.out.println("Data가 없다");
		}
		
		DBConnection.disConnect(rs, st, connection);
//		rs.close();
//		st.close();
//		connection.close();
		return departmentDTO;
	}
//	public void getList() throws Exception {
//		
//		Connection connection = DBConnection.getConnection();
//		//1. 접속 정보 준비
//		
//		//3. Query문 생성
//		String sql ="SELECT * FROM LOCATIONS";
//		//4. Query문 미리 전송
//		PreparedStatement st = connection.prepareStatement(sql);
//		
//		
//		//5.? 세팅
//		
//		//6. 최종 전송 및 결과 처리
//				ResultSet rs = st.executeQuery();
//				
//				while(rs.next()){
//					System.out.println(rs.getInt("LOCATION_ID"));
//					System.out.println(rs.getString("STREET_ADDRESS"));
//					System.out.println(rs.getString("POSTAL_CODE"));
//					System.out.println(rs.getString("CITY"));
//					System.out.println(rs.getString("STATE_PROVINCE"));
//					System.out.println(rs.getString("COUNTRY_ID"));
//				}
//				rs.close();
//				st.close();
//				connection.close();
//	} 

	
	
	

}
