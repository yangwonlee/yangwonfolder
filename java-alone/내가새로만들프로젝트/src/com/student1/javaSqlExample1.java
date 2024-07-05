package com.student1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;	

public class javaSqlExample1 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
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
		//게시글 조회 쿼리
		String sql1 = "SELECT sep, genre, title, content, create_date, update_date, read_count FROM webtoon "
			    + "WHERE sep = " + 2 + "or title = '" + "제목입니다1" + "'";	//이걸 할 땐, 스테이트먼트 기능을 사용하지 않으니, pstmt. 쪽을 없애주어야 기능함. 그러니 복잡하니 이건 잘 안씀.
		try {
			pstmt = conn.prepareStatement(sql1);	//sql문자열에 있는 sql문을 실행. 
			rs = pstmt.executeQuery();	//sql문자열에 있는 sql(select문을 실행.
			
			while(rs.next()) {
				System.out.println("웹툰 번호: " + rs.getString("seq"));	//각행의 seq컬럼 반환
				System.out.println("웹툰 장르: " + rs.getString("genre"));// 각행의 genre값 반환
				System.out.println("웹툰 제목: " + rs.getString("title"));//각행 title값 반환
				System.out.println("웹툰 줄거리: " + rs.getString("content"));//각행 ~
				System.out.println("웹툰 등록일자: " + rs.getString("create_date"));
				System.out.println("웹툰 수정일자: " + rs.getString("update_date"));
				System.out.println("웹툰 조회수: " + rs.getString("read_count"));
				
				System.out.println("---------------------------------------------");
			}
			if (rs != null) {		//데이터 가져온 것을 close
				rs.close();
			}
			if (pstmt != null) {	//데이터 가져온 실행을 close
				pstmt.close();
			}
			if (conn != null) {		//오라클 접속을 close
				conn.close();
			}

		}catch(SQLException se){
			se.printStackTrace(); // 에러 추적 표시. sql예외를 se에 대입.
			
			System.out.println("db-sql실행 오류");
		}
		System.out.println("javasql테스트 프로그램 종료");
	}
	
}
