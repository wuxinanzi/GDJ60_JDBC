package com.iu.main.locations;

import java.util.Scanner;

public class LocationInput {	
	private Scanner sc;
	
	public LocationInput() {
		sc = new Scanner(System.in);
	}
	public LocationDTO updateDate() {
		LocationDTO locationDTO = new LocationDTO();
		System.out.println("수정할 주소");
		locationDTO.setStreet_address(sc.next());
		return locationDTO;
	}
	
	public LocationDTO setData() {
		LocationDTO locationDTO = new LocationDTO();
		System.out.println("부서명 입력");
		locationDTO.setLocation_id(sc.nextInt());
		System.out.println("주소를 입력");
		locationDTO.setStreet_address(sc.next());
		System.out.println("코드 입력");
		locationDTO.setPostal_code(sc.next());
		System.out.println("도시 입력");
		locationDTO.setCity(sc.next());
		System.out.println("지역 입력");
		locationDTO.setState_province(sc.next());
		System.out.println("나라 입력");
		locationDTO.setCountry_id(sc.next());
		return locationDTO;
	}
	public LocationDTO deleteData() {
		LocationDTO locationDTO = new LocationDTO();
		System.out.println("삭제할 부서 번호 입력");
		locationDTO.setLocation_id(sc.nextInt());
		return locationDTO;
	}

}
