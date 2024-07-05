//오라클 디비를 관리하는 클래스. 즉 디비버와 연동을 위해 있어야할 매니저 클래스.
package com.student1.utils;
import java.sql.Connection;//sql데이터베이스와의 연결을 나타내는 인터페이스
import java.sql.DriverManager;//jdbc드라이버를 관리하고 데이터베이스 연결을 설정하는 클래스
import java.sql.PreparedStatement;//미리 컴파일된 sql문을 나타내는 인터페이스. 주로 보안과 성능을 위해 사용.
import java.sql.ResultSet;//sql쿼리의 결과를 나타내는 인터페이스. 결과집합을 처리
import java.sql.SQLException;//데이터베이스 액세스 관련 예외처리르 위한 클래스
//import java.sql.*;가 유용하지만 난 초보니, 유지보수의 편리성을 위해 다 써주었다.

public class DBManager {
// 오라클 접속 메소드
// @return Connection 객체 -> 오라클 접속 클래스 객체
	public static Connection getDBConnection() {
		Connection conn = null;
		//따로 메소드로 분리 후 관리. 커넥션을 오라클에서 가져옴. 또한 커넥션을 앞으로 conn에 대입하고,
		// 이것이 null값임을 선언.
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // 오라클 접속을 위한 driver 사전작업
			//오라클 접속할 위치값 저장.
			String url = "jdbc:oracle:thin:@localhost:1521/orcl2";
			String username = "boarduser1";	//오라클 접속 계정 id
			String password = "1234";		//오라클 접속 계정 pw
			
			conn = DriverManager.getConnection(url, username, password);
			//실제 오라클에 접속하여 접속을 다루는 객체를 받아서 connection클래스 객체에 대입.
		} catch(Exception e) {
			e.printStackTrace();
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
