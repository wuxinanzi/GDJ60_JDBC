package com.iu.main.Emplyees;

import java.sql.Date;
import java.util.Scanner;

public class EmployeeInput {
	private Scanner sc;
	private Date date() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public EmployeeInput() {
		sc = new Scanner(System.in);
	}	
	public EmployeeDTO updateDate() {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		System.out.println("수정할사원번호를 입력하세요");
		employeeDTO.setEmployee_id(sc.nextInt());
		System.out.println("수정할 성을 입력하세요");
		employeeDTO.setLast_name(sc.next());
		System.out.println("수정할 이름을 입력하세요");
		employeeDTO.setFirst_name(sc.next());
		System.out.println("수정할 이메일을 입력하세요");
		employeeDTO.setEmail(sc.next());
		System.out.println("수정할 핸드폰을 입력하세요");
		employeeDTO.setPhone_number(sc.next());
		System.out.println("수정할 입사 날짜를 입력하세요");
		employeeDTO.setHire_date(sc.next());
		System.out.println("수정할 직업 아이디를 입력하세요");
		employeeDTO.setJob_id(sc.next());
		System.out.println("수정할 확인 받은걸 입력하세요");
		employeeDTO.setCommission_pct(sc.nextDouble());
		System.out.println("수정할 매니저 아이디를 입력하세요");
		employeeDTO.setManager_id(sc.nextInt());
		System.out.println("수정할 부서 아이디를 입력하세요");
		employeeDTO.setDepartment_id(sc.nextInt());
		return employeeDTO;
	}
	
	public EmployeeDTO setData() {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		System.out.println("사원번호를 입력하세요");
		employeeDTO.setEmployee_id(sc.nextInt());
		System.out.println("성을 입력하세요");
		employeeDTO.setLast_name(sc.next());
		System.out.println("이름을 입력하세요");
		employeeDTO.setFirst_name(sc.next());
		System.out.println("이메일을 입력하세요");
		employeeDTO.setEmail(sc.next());
		System.out.println("핸드폰을 입력하세요");
		employeeDTO.setPhone_number(sc.next());
		System.out.println("입사 날짜를 입력하세요");
		employeeDTO.setHire_date(sc.next());
		System.out.println("직업 아이디를 입력하세요");
		employeeDTO.setJob_id(sc.next());
		System.out.println("확인 받은걸 입력하세요");
		employeeDTO.setCommission_pct(sc.nextDouble());
		System.out.println("매니저 아이디를 입력하세요");
		employeeDTO.setManager_id(sc.nextInt());
		System.out.println("부서 아이디를 입력하세요");
		employeeDTO.setDepartment_id(sc.nextInt());
		return employeeDTO;
	}
	public EmployeeDTO deleteDate() {
		EmployeeDTO employeeDTO = new EmployeeDTO();
		System.out.println("삭제할 사원 번호 입력 ");
		employeeDTO.setEmployee_id(sc.nextInt());
		return employeeDTO;
	}
	
}
