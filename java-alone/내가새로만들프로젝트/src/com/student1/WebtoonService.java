package com.student1;

import java.sql.*;
import java.util.*;
import com.student1.utils.DBManager;	//디비 매니저도 가져와서 sql과 연동을 시킴.

public class WebtoonService {
	Scanner scanner = new Scanner(System.in);	//키보드 입력 받는 객체.		
	//게시글 작성
	public int insertWebtoon() {		//이게 메뉴판. 리턴값으로 인트를 받음. 5트
		while(true) {				
		//게시글 장르 받기.
		System.out.println("웹툰 장르:(취소:quit) "); //quit를 누르면 나가게 됨.
		String genre = scanner.nextLine(); // 키보드로 '글제목'받기.
		if (genre.equals("quit")) {
			System.out.println("작성이 취소되었습니다.");
			return -1;	//특정한 상황, 사용자가 quit를 입력했을 때 작성을 취소하고 메서드 실행을 종료.
			//종료한건 한거고, 잘 처리가 되었으면 0을 반환. 일단 글작성이 취소되었음을 알리는 신호.
		}
		//2. 게시글 제목 받기
		System.out.println("웹툰 제목:(취소:quit) ");
		String title = scanner.nextLine();
		if (title.equals("quit")) {
			System.out.println("작성이 취소되었습니다.");
			return -1;
		}
		//3. 게시글 내용 받기
		System.out.println("웹툰 내용:(취소:quit) ");
		String content = scanner.nextLine();
		if (content.equals("quit")) {
			System.out.println("작성이 취소되었습니다.");
			return -1;
			}
		//4. 게시글 별점 주기.
		System.out.println("웹툰 별점주기: (취소:quit)");
		String rating = scanner.nextLine();
		if (rating.equals("quit")) {
			System.out.println("작성이 취소되었습니다.");
			return -1;
		}
		
		//5. 웹툰 작가 적기.
		System.out.println("웹툰 작가명: (취소:quit)");
		String author = scanner.nextLine();
		if (author.equals("quit")) {
			System.out.println("작성이 취소되었습니다.");
			return -1;
		}
		
		// 위의 입력된 게시글의 제목과 내용을 conn으로 받아서 oracle db에 저장할 수 있도록 접속준비.
		Connection conn = DBManager.getDBConnection();
		
		String insertSql = """
				INSERT INTO webtoon(seq, genre, title, CONTENT, rating, author, create_date, update_date, READ_COUNT)
						VALUES(seq_webtoon_no.NEXTVAL, ?, ?, ?, ?, ?, sysdate, sysdate, NULL)
				""";
		int resultRows = 0; //insert문을 실행한 뒤에 테이블 영향을 받은 행 개수.
		//보통 익스큐트에 리턴을 받음
		PreparedStatement pstmt = null;
		
		try {
			// oracle db에 데이터를 삽입코드를 실행할 준비
			pstmt = conn.prepareStatement(insertSql);
			pstmt.setString(1, genre);
			pstmt.setString(2, title);
			pstmt.setString(3, content);
			pstmt.setString(4, rating);
			pstmt.setString(5, author);
			
			// 실제로 sql코드를 실행
			resultRows = pstmt.executeUpdate(); //익스큐트 업데이트. insert update delete실행
			System.out.println("글 성공적으로 등록됨");
			
		} catch(SQLException se) {
			System.out.println("게시글 삽입하는 도중 에러가 발생 -> " + se.getMessage());
		} finally {
			DBManager.dbClose(conn, pstmt, null);
			}
		 //계속해서 글을 작성할것인지 묻는 쿼리를 넣어보자
		System.out.println("계속해서 글을 작성하시겠습니까?(Y/N)");
		String continueWriting = scanner.nextLine();
		if(!continueWriting.equalsIgnoreCase("Y")) {
			System.out.println("글 등록완료.");
			return resultRows;
			}
		System.out.println("글 등록이 완료되었습니다. 다음번 웹툰 장르를 입력해주세요");
		}
	}
	
	//게시글 목록 조회
	public void selectAllWebtoon() {
		// 게시판 목록조회 화면구성
	System.out.println("-----------------------------------------------------------------------------------------------------------------");
	System.out.println("번호		장르         제목				별점		작가 		작성일	     	수정일		 조회수");
	System.out.println("-----------------------------------------------------------------------------------------------------------------");	
	
	//1.게시글의 데이터를 받기 위해 oracle Db접속 준비
	Connection conn = DBManager.getDBConnection();
	
	//2. 조회할 sql코드
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String selectSql 
	= "select seq, genre, title, rating, author, create_date, update_date, read_count from webtoon order by seq";
	int countRows = 0; //행의 번호는 0으로 선언.
	
	try {
		pstmt = conn.prepareStatement(selectSql); //pstmt는 sql에 연결하겠다는 뜻
		rs = pstmt.executeQuery();	// rs는 조회실행이라는 뜻
		
		while(rs.next()) {		//sql실행한 데이터들의 1행을 가져옴. 없으면 false
			countRows++; //1씩 증가. 행의 개수를 몇개까지 있는지 알 수 있는 변수.
			
			System.out.println(
				String.format("%-10s", rs.getString("seq")) + //문자열 형식화.
				String.format("%-20s", rs.getString("genre")) +
				String.format("%-15s", rs.getString("title")) +
				String.format("%-15s", rs.getString("rating")) +
				String.format("%-15s", rs.getString("author")) +
				String.format("%-15s", rs.getString("create_date")) + //컨텐트는 상세조회에서
				String.format("%-15s", rs.getString("update_date") == null ? "": rs.getDate("update_date")) +
				String.format("%10s", rs.getString("read_count"))			
			);		
		}
		if (countRows == 0) {	//만약 webtoon테이블에 데이터가 없을 경우.
			System.out.println("게시글이 존재하지 않습니다.");
		}
	}catch(SQLException se){
		System.out.println("게시글 목록 조회하는 도중 에러가 발생 -> " + se.getMessage());
	}finally {
		DBManager.dbClose(conn, pstmt, rs);
	}
}
//콘솔에서 사용자의 키보드를 입력받은 값을 리턴.
	//리턴 게시판 번호
	private int getWebtoonNo() { //메소드 사이에 넣기. 게시판 번호를 받는다.
		int webtoonNo = 0;	//자 보드넘버를 줄게. 0이 시작이야?
		while(true) {		//만약 번호를 잘 눌러서 트루가 된다면 계속 반복해.
			System.out.println("게시판 번호를 입력하세요.");	//게시판 번호를 입력하세요가 뜰거야.
			try {		
				webtoonNo = Integer.parseInt(scanner.nextLine()); //보드 넘버를 눌러.
				break;	// 그러면 저 와일문을 빠져나오는 거야.
			} catch(InputMismatchException | NumberFormatException e) {	//만약 아니라면 이 두개의 에러가 뜰텐데
				System.out.println("잘못된 값을 입력하셨습니다. 다시 입력을 해주세요.");// 그럼 이런말이 반환될거야.
				
			}catch(Exception e) { //그도 아니라면
				System.out.println("알 수 없는 오류 -> " + e.getMessage()); // 알 수 없는거지.
			}
		}
		return webtoonNo;	//웹툰 넘버만 치면 위의 코드들이 다 나옴. 반복적으로 사용하자.
	}
	
	//게시판 상세조회
	public void selectOneWebtoon() {
		int webtoonNo = getWebtoonNo();
		
		Connection conn = DBManager.getDBConnection();
		
		String countSql = "select count(*) from webtoon where seq = ? "; //조회수 올리기 
		//상세조회할 sql코드 작성
		String detailselectSql = "select * from webtoon where seq = ? "; 
		//특정 seq에 해당하는 게시글을 조회.
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			//3. sql실행(countSql)
			pstmt = conn.prepareStatement(countSql);
			pstmt.setInt(1, webtoonNo);	//게시글 번호 설정.
			rs = pstmt.executeQuery(); //실행하는 쿼리
			while(rs.next()) {
			if(rs.next()) { //검색하는 쿼리. 하나만 검색하는거니 if.
				int rowCount = rs.getInt(1); //count()*값 가져오기
				
				if(rowCount == 0) {
					System.out.println("상세조회할 게시글 번호가 없습니다.");
					return; //없으니 리턴을 해서, 메뉴로 되돌아감.
				}
			}
			
			//4. sql문 두개 실행. detailSelectSql
			pstmt = conn.prepareStatement(detailselectSql);
			pstmt.setInt(1, webtoonNo);	// 조회할 게시글 넘버
			rs = pstmt.executeQuery(); //rs치면 pstmt의 함수에 따라 실행하라는 뜻?
			
			if(rs.next()) {		
				System.out.println("--------------------------");
				System.out.println("웹툰 번호: " + rs.getInt("seq"));
				System.out.println("웹툰 장르: " + rs.getString("genre"));
				System.out.println("웹툰 제목: " + rs.getString("title"));
				System.out.println("웹툰 내용: " + rs.getString("content"));
				System.out.println("웹툰 별점: " + rs.getString("rating"));
				System.out.println("웹툰 작가: " + rs.getString("author"));
				System.out.println("게시글 작성일: " + rs.getDate("create_date"));
				System.out.println("게시글 수정일: " + rs.getDate("update_date"));
				System.out.println("조회수: " + rs.getInt("read_count"));
				System.out.println("--------------------------");
			
				//조회수 1증가 쿼리
				String updateQuery 
				= "UPDATE webtoon SET read_count = NVL(read_count, 0) + 1 where seq = ?";
				pstmt = conn.prepareStatement(updateQuery);
				pstmt.setInt(1, webtoonNo);
				pstmt.executeQuery();
				}
			}
		}catch(SQLException se) {
			System.out.println("게시글 목록 조회하는 도중 에러가 발생 -> " + se.getMessage());
		}finally {
			DBManager.dbClose(conn, pstmt, rs);
		}
	}
	
	public void selectAllwebtoonwithAuthors() {
		Connection conn = DBManager.getDBConnection();
		String selectSql 
		= "SELECT seq, genre, title, rating, author, create_date, update_date, read_count from webtoon ORDER BY seq";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			pstmt = conn.prepareStatement(selectSql);
			rs = pstmt.executeQuery();
			
			while (rs.next()){		
					System.out.println("--------------------------");
					System.out.println("웹툰 번호: " + rs.getInt("seq"));
					System.out.println("웹툰 장르: " + rs.getString("genre"));
					System.out.println("웹툰 제목: " + rs.getString("title"));
					System.out.println("웹툰 내용: " + rs.getString("content"));
					System.out.println("웹툰 별점: " + rs.getString("rating"));
					System.out.println("웹툰 작가: " + rs.getString("author"));
					System.out.println("게시글 작성일: " + rs.getDate("create_date"));
					System.out.println("게시글 수정일: " + rs.getDate("update_date"));
					System.out.println("조회수: " + rs.getInt("read_count"));
					System.out.println("--------------------------");
			}
		}catch (SQLException se) {
			System.out.println("웹툰과 작가정보를 조회하는 도중 에러가 발생 -> " + se.getMessage());
		}finally {
			DBManager.dbClose(conn, pstmt, rs);
		}
		
	}	
	
	
	//웹툰 별점 보기.
	public void ratingOneWebtoon() {

		Connection conn = DBManager.getDBConnection();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String selectSql = "SELECT seq, genre, title, rating, author from webtoon ORDER BY seq DESC";
		int countRows = 0;
		int ratingNumber = 0;
		
		try {
			pstmt = conn.prepareStatement(selectSql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				countRows++;
				
				System.out.println(
						String.format("%-10s", rs.getString("seq")) +
						String.format("%-10s", rs.getString("genre")) +
						String.format("%-10s", rs.getString("title")) +
						String.format("%-10s", rs.getString("rating")) +
						String.format("%-10s", rs.getString("author"))
						);	
			}
			if (countRows == 0) {
				System.out.println("게시글이 존재하지 않습니다.");
			}
		}catch(SQLException se) {
			System.out.println("별점 목록 조회중 에러 발생 -> " + se.getMessage());
		}finally {
			DBManager.dbClose(conn, pstmt, rs);
		}
	}		
	
	//게시글 수정
	public void updateOneWebtoon() {
		//1. 수정할 게시글 번호
		System.out.println("수정할 게시판 번호를 입력하세요.");
		int webtoonNo = Integer.parseInt(scanner.nextLine());
		
		String countSql = "select count(*) from webtoon where seq = ? ";
		//oracle DB접속 준비.
		Connection conn = DBManager.getDBConnection();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int resultRow = 0;
		
		try {
			pstmt = conn.prepareStatement(countSql);
			pstmt.setInt(1, webtoonNo); //pstmt에 매개변수를 설정 했어야 했음. 이 쿼리가없어서 오류
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				resultRow = rs.getInt(1); //만약 시작한다면 1번부터 시작하라. 0은안돼.
				if(resultRow == 0) {
					System.out.println("수정할 게시글 번호가 없습니다.");
					return;
					
				}
			}
		}catch(SQLException se) {
			System.out.println("게시글을 수정하는 도중 에러가 발생 -> " + se.getMessage());
		}
		//2. 수정할 게시글 장르
		System.out.println("수정할 게시판 장르를 입력하세요.");
		String newGenre = scanner.nextLine();
		
		//3. 수정할 게시글 제목
		System.out.println("수정할 게시판 제목을 입력하세요");
		String newTitle = scanner.nextLine();
		
		//4. 수정할 게시글 내용
		System.out.println("수정할 게시판 내용을 입력하세요.");
		String newContent = scanner.nextLine();
		
		//4. 수정할 별점
				System.out.println("수정할 별점을 입력하세요.");
				String newRating = scanner.nextLine();
		
		//5. 수정할 작가명
				System.out.println("수정할 작가명을 입력하세요.");
				String newAuthor = scanner.nextLine();
		
		//5. 게시글 특정 번호 수정
		String updateOneWebtoon
		= "update webtoon set genre = ?, title = ?, content = ?, rating = ?, author = ?,  update_date = sysdate where seq = ?";
		//타이틀과 장르등을 ?로 받을 수 있음.
		
		try {
			pstmt = conn.prepareStatement(updateOneWebtoon);
			pstmt.setString(1, newGenre);	//첫 매개변수 seq, 즉
			pstmt.setString(2, newTitle);
			pstmt.setString(3, newContent);
			pstmt.setInt(4, webtoonNo);
			pstmt.setString(5, newRating);
			pstmt.setString(6, newAuthor);
			resultRow = pstmt.executeUpdate(); //업데이트 실행.
			
			System.out.println("게시글 번호" + webtoonNo + "를 성공적으로 수정하였습니다.");
		
		}catch(SQLException se) {
			System.out.println("게시글을 수정하는 도중 에러가 발생 -> " + se.getMessage());
		}finally {
			DBManager.dbClose(conn, pstmt, rs);
		
		}
	}
	
	//게시글 삭제
	public void deleteOneWebtoon() {
		System.out.println("삭제할 게시판 번호를 입력하세요.");
		int webtoonNo = Integer.parseInt(scanner.nextLine());
		
		//삭제를 더블체크
		System.out.println("정말 " + webtoonNo + "번 게시글을 삭제하시겠습니까? (Y/N)");
		String confirmYN = scanner.nextLine();
		if (!confirmYN.equals("Y"))// 만약 와이가 아니라면? return하라
			return;
		//오라클 디비 접속준비 4트쨰다.
		Connection conn = DBManager.getDBConnection();
		
		//입력한 게시글 번호의 개수 가져오기
		String countSql = "select count(*) from webtoon where seq = ? ";
		String deleteOneSql = "DELETE from webtoon where seq = ? ";

		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int resultRow = 0;
		
		
		try {
			//sql 실행
			pstmt = conn.prepareStatement(countSql);
			pstmt.setInt(1, webtoonNo);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				resultRow = rs.getInt(1); //count값 1.
				
				if(resultRow == 0) {
					System.out.println("삭제할 게시글 번호가 없습니다.");
					return;
				}
			}
			pstmt = conn.prepareStatement(deleteOneSql);
			pstmt.setInt(1, webtoonNo);
			resultRow = pstmt.executeUpdate(); //delete 실행
			
			System.out.println("게시글 번호" + webtoonNo + "를 성공적으로 삭제하였습니다.");
		}catch(SQLException se) {
			System.out.println("게시글을 삭제하는 도중 에러가 발생 -> " + se.getMessage());
		}finally {
			DBManager.dbClose(conn, pstmt, rs);
		}
		
	}
}
