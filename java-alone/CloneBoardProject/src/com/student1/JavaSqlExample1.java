package com.student1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;	

public class JavaSqlExample1 {

	public static void main(String[] args) {
		// java와 oracle sql을 연동하는 예제
		
		//1.java와 oracle을 연동 지원을 해주는 드라이버(oracle 회사에서 jar파일로 제공)를 설정해야함.
		//	이걸 관리하는 폴더를 하나 더 만들어야 함. 그것이 libs폴더.+이 폴더로 옮긴걸 이클립스가 인식해야함.
		//  clone boardproject에서 우클릭, 빌드 패스- 컨피규어 빌드 패스 - libs폴더 클릭 - 
		// add external 누르고 선생님이 주신 파일 클릭 = 인식완료
		//	(1) ojdbc8~ jar파일 프로젝트 내에 저장.
		//	(2) java build path - library - class path에 add external jars로 (1)의 파일을 등록
		
		// 2. odjbc의 패키지 라이브러리 클래스 파일 중에 접속 및 연동을 도와주는 클래스 객체를 선언
		//		(1) connection -> DBMS 접속 관리 클래스
		//		(2) Statement, PrepareStatement > sql 실행을 도와주는 클래스
		//		(3) ResultSet -> sql 실행 이후 결과 데이터들을 컨트롤 하는 클래스
		Connection conn = null;	//db만들떄 항상 쌍으로 쓰이는 것들. 일단 오류가 나는 이유는 선언이 안되서
		PreparedStatement pstmt = null;	// 그러니 임포트를 해서 가져오자.
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
		
	// 게시글 조회 쿼리(query)
//	String sql1 = "SELECT seq, title, content, create_date, read_count FROM board WHERE seq = 2";	//두번째인것만 가져오려면 where seq = 2
	//String sql1 = "SELECT * FROM board";
//	String sql1 = "SELECT seq, title, content, create_date, read_count FROM board WHERE seq =? or title =?";
		String sql1 = "SELECT seq, title, content, create_date, read_count FROM board "
					    + "WHERE seq = " + 2 + "or title = '" + "제목입니다1" + "'";	//이걸 할 땐, 스테이트먼트 기능을 사용하지 않으니, pstmt. 쪽을 없애주어야 기능함. 그러니 복잡하니 이건 잘 안씀.

	try {
		pstmt = conn.prepareStatement(sql1);		// sql1 문자열에 있는 sql문을 실행
//		pstmt.setInt(1, 2); //첫번째 ?에 숫자 2를 세팅.
//		pstmt.setString(2, "제목입니다1");	//두번째 ?에 문자열 '제목입니다1'를 세팅
		rs = pstmt.executeQuery();						// sql1문자열에 있는 sql(select문)을 실행
			// select문만 가능.
		while(rs.next()) {	//rs.next()는 가져온 데이터들의 행을 가져오고 값이 있다면 true를 반환. 리턴값은 스트링
			System.out.println("게시판 번호: " + rs.getString("seq")); //각 행의 seq컬럼의 값을 가져옴(리턴값 타입 string을 가져온다
			System.out.println("게시판 제목: " + rs.getString("TITLE")); //각 행의 seq컬럼의 값을 가져옴
			System.out.println("게시판 내용: " + rs.getString("CONTENT"));	//각행의 Content값을 가져옴
			System.out.println("게시판 등록일자: " + rs.getString("CREATE_DATE"));	//각행의 create_date값을 가져옴
			System.out.println("게시글 조회수: " + rs.getString("READ_COUNT"));	//각행의 read_coubt값을 가져옴
// 문장들을 드래그 한 후 오른쪽 위에 source에서 toggle comment를 누르면 한꺼번에 주석처리가 됨. ctrl+/ 단축키.
//컬럼명으로 가져오는 법	
				
//			System.out.println("게시판 번호: " + rs.getString(1)); //각 행의 첫번쨰 컬럼(seq컬럼)의 값을 가져옴
//			System.out.println("게시판 제목: " + rs.getString(2)); //각 행의 두번째 컬럼(title컬럼)의 값을 가져옴
//			System.out.println("게시판 내용: " + rs.getString(3));	//각행의 세번째 컬럼(Content)의 값을 가져옴
//			System.out.println("게시판 등록일자: " + rs.getString(4));	//각행의 네번째 컬럼(create_date)의값을 가져옴				System.out.println("게시글 조회수: " + rs.getString(5));	//각행의 다섯번째 컬럼(read_count)의 값을 가져옴
//			System.out.println("게시글 조회수: " + rs.getString(5));
			
//			System.out.println("게시글 번호: " + rs.getInt("seq")); //각행의 첫번째 컬럼(seq컬럼)의 값(리턴값타입 string)을 가져온다
//			System.out.println("게시글 번호: " + rs.getInt(1));
//			//System.out.println("게시글 번호: " + rs.getInt("title")); //-> 에러. 타이틀 컬럼의 데이터 형테는 String이기 때문
//			System.out.println("게시글 번호: " + rs.getInt(5));	//null일 경우에는 기본적으로 0
				
			System.out.println("----------------------------------------------------");
			}
		// 쓰레기 정리용도. DB입출력 자원을 정리. CONNECTION CONN, PSTMT RESULT등을 열었으니 닫아야 함.
		if (rs != null) {		//데이터 가져온 것을 close
			rs.close();
		}
				if (pstmt != null) {	//데이터 가져온 실행을 close
			pstmt.close();
		}
				if (conn != null) {		//오라클 접속을 close
			conn.close();
		}
				
		} catch(SQLException se) {
			se.printStackTrace(); 	//에러 추적 표시
			
			System.out.println("db-sql실행오류");
		}
		
		System.out.println("javasql 테스트 프로그램 종료");
	}

}
