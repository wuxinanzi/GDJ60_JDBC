package com.iu.main.util;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

public class DBConnection {
	
	public static Connection getConnection() throws Exception {
		//1 접속 
		System.out.println("Get Connection");
		//1. id
		String username="hr";
		//2. pw
		String password="hr";
		//3.URL
		String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";//패키지명과 클래스명
		//4.driver
		String driver = "oracle.jdbc.driver.OracleDriver";
		
		Class.forName(driver);//이름으로 클래스 타입을 만들려함
		
		
		//2DB 접속 실행
		Connection connection = DriverManager.getConnection(url, username, password);
		//3.Query문 생성
//		String sql ="SELECT * FROM LOCATIONS";
//		
//		//4.Query문을 DB로 미리 전송(미완성)
//		
//		PreparedStatement st = connection.prepareStatement(sql);
//		
//		//5. ? 값 세팅(option)
//		
//		//6. 최종 전송 및 결과 처리
//		ResultSet rs = st.executeQuery();
//		
//		while(rs.next()){
//			System.out.println(rs.getInt("LOCATION_ID"));
//			System.out.println(rs.getString("STREET_ADDRESS"));
//			System.out.println(rs.getString("POSTAL_CODE"));
//			System.out.println(rs.getString("CITY"));
//			System.out.println(rs.getString("STATE_PROVINCE"));
//			System.out.println(rs.getString("COUNTRY_ID"));
//		}
//		//7. 연결 해제 
	return connection;
	}
	public static void disConnect( PreparedStatement st,Connection connection) throws Exception {
		
		st.close();
		connection.close();
	}

	public static void disConnect(ResultSet rs, PreparedStatement st,Connection connection) throws Exception {
		rs.close();
		st.close();
		connection.close();
	}

}
