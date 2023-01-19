package com.iu.main.Emplyees;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.main.departments.DepartmentDAO;

public class EmplyessController {
	
	private Scanner sc;
	private EmployeeDAO emplyessDAO;
	private EmployeeDTO emplyessDTO;
	
	public EmplyessController() {
		this.sc = new Scanner(System.in);
		this.emplyessDAO = new EmployeeDAO();
		this.emplyessDTO = new EmployeeDTO();
	}
	public void start() throws Exception{
		boolean check = true;
	
		while(check) {
			System.out.println("1.사원정보리스트");
			System.out.println("2.개별사원정보");
			System.out.println("3.사원검색(LastName)");
			System.out.println("4.부서 추가");
			System.out.println("5.부서 삭제");
			System.out.println("6.부서 수정");
			System.out.println("7.종       료");
			int select = sc.nextInt();
			
			switch(select) {
			case 1://사원정보리스트 (사원번호,성,이름,직급,부서번호)
				ArrayList<EmployeeDTO> ar = emplyessDAO.getList();
				break;
			case 2:
				//개별사원정보 사원하명의 모든정보 출력 사원번호만
				System.out.println("부서");
				
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
			    break;
			default:
				check = false;
			}
			
		}
	}
}
