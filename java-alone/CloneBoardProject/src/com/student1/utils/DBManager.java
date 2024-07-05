// 오라클 디비를 관리하는 클래스.
package com.student1.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBManager {
	//설명: 오라클 접속 메소드
	// @return Connection 객체 -> 오라클 접속 클래스 객체
	public static Connection getDBConnection() {
		Connection conn = null;
		//따로 메소드로 분리 후 관리. 커넥션을 가져옴.
		try {
			Class.forName("oracle.jdbc.OracleDriver"); 		//오라클 접속을 위한 driver 사전 작업.
			//오라클이 어딨는질 알아야 함. 오라클 접속할 위치값 저장.
			String url = "jdbc:oracle:thin:@localhost:1521:orcl2";
			String username = "boarduser1";		//오라클 접속 계정 id
	 		String password = "1234";			//오라클 접속 계정 pw
			
			conn = DriverManager.getConnection(url, username, password); 
			//실제 오라클 접속하여 접속을 다루는 객체를 받아서 Connection클래스 객체에 대입
		} catch(Exception e) {
			e.printStackTrace(); 	//에러 추적 표시
			
			System.out.println("DB연결 오류");
		}
			
		return conn;
	}
	
	public static void dbClose(Connection conn, PreparedStatement pstmt, ResultSet rs) {
		//DB입출력 자원 정리
		try {
		if (rs != null) {		//데이터 가져온 것을 close
			rs.close();
		}
				if (pstmt != null) {	//데이터 가져온 실행을 close
			pstmt.close();
		}
				if (conn != null) {		//오라클 접속을 close
			conn.close();
		}
	}catch (SQLException se){
		System.out.println("Oracle DB IO 오류 -> " + se.getMessage());
		}
	}
}
