// 기초 crud.
package com.student1;

import java.sql.*;
import java.util.*;

import com.student1.utils.DBManager;

public class Board1Service {
	Scanner scanner = new Scanner(System.in); // 키보드 입력 받는 객체
// 전체적으로 다 쓰이기 때문에 범용적이기 때문에, 위에다가 올리는게 좋음.
	/*
	 * 설명: 게시글 작성
	 */

	public int insertBoard() { // 리턴값은 인트라는 뜻. 4트
		
		
		// 1. 게시글 제목 받기
		System.out.print("글 제목:(취소:quit) "); // quit를 누르면 나가게 됨.
		String title = scanner.nextLine(); // 키보드로 '글제목'받기
		if (title.equals("quit")) {
			System.out.println("작성이 취소되었습니다.");
			return -1;								
		}

		// 2. 게시글 내용 받기
		System.out.print("글 내용:(취소:quit): ");
		String content = scanner.nextLine();
		if (title.equals("quit")) {
			System.out.println("작성이 취소되었습니다.");
			return -1;
		}

		// 3. 위의 입력된 게시글의 제목과 내용을 받아서 oracle db에 저장할 수 있도록 db접속준비를 함.
		Connection conn = DBManager.getDBConnection();

		// 4. oracle db에 데이터를 삽입하기 위해 인서트 sql문을 작성
		String insertSql = """
						INSERT INTO board(seq, title, CONTENT, READ_COUNT)
						VALUES(seq_board_no.NEXTVAL, ?, ?,  0)
				"""; // 물음표가 위에 타이틀이랑 컨텐트에 들어갈 예정.
		// 열 인덱스가 부적합하다라는 오류= 오타나 "가 추가가 된 상황.
		int resultRows = 0; // insert문을 실행한 뒤에 테이블 영향을 받은 행 개수. 보통 익스큐트에 리턴을 받음.
		PreparedStatement pstmt = null;

		try {
			// 5. oracle db에 데이터를 삽입코드를 실행할 준비
			pstmt = conn.prepareStatement(insertSql); // 예외처리를 해야 오류가사라짐. 인서트sql에 오류가 났음.
			pstmt.setString(1, title); // 위 insertSql에 첫번쨰 ?에 키보드로 입력받은 제목을 세팅
			pstmt.setString(2, content);// 위 insertSql에 첫번쨰 ?에 키보드로 입력받은 내용을 세팅

			// 6.실제로 sql코드를 실행
			resultRows = pstmt.executeUpdate(); // 익스큐트업데이트로 insert, update, delete sql코드를 실행
			System.out.println("글 성공적으로 등록됨");

		} catch (SQLException se) {
			System.out.println("게시글 삽입하는 도중 에러가 발생 -> " + se.getMessage());
		} finally {
			DBManager.dbClose(conn, pstmt, null); // 트라이 캐치문 안에 pstmt가 있어서 오류. 분리해야함.
			// 7. oracle db 접속 관련
		}

		return resultRows;
	}

	/*
	 * 설명: 게시글 목록조회
	 */
	public void selectAllboard() {				
	
		
		// 게시판 목록조회 화면구성
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		System.out.println("번호		제목				작성일		수정일			조회수");
		System.out.println("-----------------------------------------------------------------------------------------------------------------"); 
	 
		//oracle DB의 Board 테이블에서 위의 네가지 항목(번호, 제목, 작성일자, 조회)가 나오도록 출력 
		// 1. 게시글의 데이터를 받기 위해 oracle db접속 준비
		Connection conn = DBManager.getDBConnection();

		//2. 조회할 sql코드
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String selectSql="select seq, title, create_date, read_count,update_date from board order by seq DESC";
		int countRows = 0; //행의 번호.
		
		try{
			pstmt = conn.prepareStatement(selectSql);
			rs = pstmt.executeQuery();	//조회 실행
			
			while(rs.next()) {		//sql실행한 데이터들의 1행을 가져옴.(데이터가 없으면 true 없으면 폴스)
				countRows++; //1씩 증가. 행의 개수를 몇개까지 있는지 알 수 있는 변수가 됨.
				
//				System.out.println( 
//				rs.getString.("seq") + "    " + rs.getString("title") + "    " + rs.getString("create_date") + "	" + rs.getString("read_count")
//				);
				// printf -> %-3s -> '-'는 오른쪽에서부터 공백 문자열을 채워넣는다.
				// printf -> 3s -> 일반 숫자는 왼쪽에서부터 문자열을 채워줌.
//				System.out.printf(
//						"%-6s	|	%-30s	|	%-20s\n"
//						,rs.getString("seq")
//						,rs.getString("title")
//						,rs.getString("create_date")
//						,rs.getString("read_count") == null ? "" : rs.getString("read_count")
//						);
	
				System.out.println(
					String.format("%-10s", rs.getString("seq")) + 
					String.format("%-30s", rs.getString("title")) +
					String.format("%-15s" , rs.getString("create_date")) +
					String.format("%-15s" , rs.getString("update_date") == null ? "": rs.getDate("update_date")) +
					String.format("%10s", rs.getString("read_count"))
				);
			
			}
			if (countRows == 0) {		//board 테이블에 데이터가 없을 경우. 
				System.out.println("게시글이 존재하지 않습니다.");	
			}
			
		}catch(SQLException se) {
			System.out.println("게시글 목록 조회하는 도중 에러가 발생 -> " + se.getMessage());
		}finally {
			DBManager.dbClose(conn, pstmt, rs);
		}
	}
	
	// 설명: 콘솔에서 사용자의 키보드 입력받받은 값을 리턴
	//리턴 게시판 번호
	private int getBoardNo() {		//메소드 사이에만 넣으면 됨.
		int boardNo = 0;
		while(true) {		
		System.out.println("게시판 번호를 입력하세요.");
		boardNo = 0;
		try{
			boardNo = Integer.parseInt(scanner.nextLine());
			break;
		} catch(InputMismatchException | NumberFormatException e) {	//|는 or의 의미
			System.out.println("잘못된 값을 입력하셨습니다. 다시 입력을 해주세요.");
		}catch(Exception e) {
			
			System.out.println("알 수 없는 오류 -> " + e.getMessage());
			}
		}
		return boardNo;		//이제 boardNo만 치면 위의 코드들이 다 나옴. 반복적으로 사용 가능.
	}
	
	
	// 게시판 상세조회
	public void selectOneBoard() {		
		int boardNo = getBoardNo();

		//1. 게시글의 상세 데이터를 받기 위해 oracle DB 접속준비
		Connection conn = DBManager.getDBConnection(); 
		
		String countSql = "select count(*) from board where seq = ? "; //카운트가 0이면 0 1이면 1
		//2. 상세조회할 sql코드 작성
		String detailselectSql="select * from board where seq = ?";	
		
		//특정 seq에 해당하는 게시글을 조회해야함으로 오답 board 뒤에 where seq를 추가.
		PreparedStatement pstmt = null;
		ResultSet rs = null;		
		
	
		try{
			//3. sql실행(countSql)
			pstmt = conn.prepareStatement(countSql);
			pstmt.setInt(1, boardNo); // 조회할 게시글 번호 설정. 중요. 이쿼리를 빼먹음.
			rs = pstmt.executeQuery();
		
			if(rs.next()) {	//하나만 검색하는것이니 while문이 아닌 if문.
				int rowCount = rs.getInt(1);	//count(*)값 가져오기
				
				if(rowCount == 0) {	//count(*)값 가져오기
					System.out.println("상세조회할 게시글 번호가 없습니다.");
					return;	//이러면 리턴되서 메뉴로 되돌아감.
				}
			}
			
			//3. sql문 두개실행(detailSelectSql)
			pstmt = conn.prepareStatement(detailselectSql);
			pstmt.setInt(1, boardNo); // 조회할 게시글 번호 설정. 중요. 이쿼리를 빼먹음.
			rs = pstmt.executeQuery();
			
			if(rs.next()) {	
//무언가를 실행할때마다 if rs를 해주어야 함. sql 실행한 데이터들의 1행을 가져옴(데이터가 있으면 true, 없으면 false 
//이게 없으면 카운트를 두개를 하여 false가 됨. 이것을 통해서 count를 하고 또 이것으로 디테일이 됨
				
			System.out.println("-------------------------------------------------------------");
			System.out.println("게시글 번호: " + rs.getInt(1));
			System.out.println("게시글 제목: " + rs.getString(2));
			System.out.println("게시글 내용: " + rs.getString(3));
			System.out.println("게시글 작성일: " + rs.getDate(4));
			System.out.println("-------------------------------------------------------------");
			}
			// 조회수 1 증가
			String updateQuery = "UPDATE board SET read_count = NVL(read_count, 0) + 1 where seq = ?";
			pstmt = conn.prepareStatement(updateQuery);
			pstmt.setInt(1, boardNo); // 조회할 게시글 번호 설정. 중요. 이쿼리를 빼먹음.
			pstmt.executeUpdate();
			
			
		}catch(SQLException se) {
			System.out.println("게시글 목록 조회하는 도중 에러가 발생 -> " + se.getMessage());
		} finally {
			// Oracle DB 접속 관련 객체들 정리
			DBManager.dbClose(conn, pstmt, rs);
		}
	}		
	

// 게시글 수정
		public void updateOneBoard() {
			//1. 수정할 게시글 번호
			System.out.println("수정할 게시판 번호를 입력하세요.");
			int boardNo = Integer.parseInt(scanner.nextLine());
			
			String countSql = "select count(*) from board where seq = ? ";
			//1. 게시글의 상세 데이터를 받기 위해 oracle DB 접속 준비
			Connection conn = DBManager.getDBConnection();
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			int resultRow = 0;
			
			try{
				// 3. sql 실행
				// pstmt에 매개변수를 설정.
				pstmt = conn.prepareStatement(countSql);
				pstmt.setInt(1, boardNo); //pstmt에 매개변수를 설정 했어야 했음. 이 쿼리가없어서 오류
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					resultRow = rs.getInt(1); // count(*)값 가져오기
					if(resultRow == 0) {
						System.out.println("수정할 게시글 번호가 없습니다.");
						return;
					}
				}
			}catch(SQLException se) {
				System.out.println("게시글을 수정하는 도중 에러가 발생 -> " + se.getMessage());
			}	
				
			//2. 수정할 게시글 제목
			System.out.println("수정할 게시판 제목를 입력하세요.");
			String newTitle = scanner.nextLine();
			//3. 수정할 게시글 내용
			System.out.println("수정할 게시판 내용를 입력하세요.");
			String newContent = scanner.nextLine();
					
			//2. 게시글 특정 번호 수정 sql	
			String updateOneBoard 
			= "update board set title = ?, content = ?, update_date = sysdate where seq = ?";
			// 타이틀 ?로 받고 콘텐트 받고. 세개를 물음표로 받을 수 있겠다.
			
			try{
				// 3.sql실행
				pstmt = conn.prepareStatement(updateOneBoard);
				pstmt.setString(1, newTitle); //첫 매개변수 seq,즉 번호를 수정한다는 뜻.
				pstmt.setString(2, newContent);	//둘쨰 매개변수 제목을 수정. 수치가 부적합하다는 오류가 떴는데, 여기를 int로 받아서 부적합하다는 뜻이었다.
				pstmt.setInt(3, boardNo);	//셋쨰 매개변수 내용을 수정.
				resultRow = pstmt.executeUpdate();	//update 실행
				
			System.out.println("게시글 번호" + boardNo + "를 성공적으로 수정하였습니다.");
					
			}catch(SQLException se){
				System.out.println("게시글을 수정하는 도중 에러가 발생 -> " + se.getMessage());
			}finally {
				DBManager.dbClose(conn, pstmt, null);	//rs가 없었으니 null
			}	
		}
					
	//게시글 삭제
		
		public void deleteOneBoard() {
			System.out.println("삭제할 할 게시판 번호를 입력하세요.");
			int boardNo = Integer.parseInt(scanner.nextLine());	//nextline이랑 next 인트랑 같이쓰면 오류가 자주남
			
			//삭제 더블체크
			System.out.println("정말 " + boardNo + "번 게시글을 삭제하시겠습니까? (Y/N)");
			String confirmYN = scanner.nextLine();
			if (!confirmYN.equals("Y"))	//와이가 아니라면 = !, 삭제.
				return;
				
			//1. 게시글의 상세 데이터를 받기 위해 oracle DB 접속 준비
			Connection conn = DBManager.getDBConnection();
			
			//입력한 게시글 번호의 개수를 가져오기.
			String countSql = "select count(*) from board where seq = ? ";
			
			//2. 게시글 특정 번호 삭제 sql
			String deleteOneSql = "DELETE * from board where seq = ?";
			
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			int resultRow = 0;
			
			try{	
				// 3. sql 실행
				pstmt = conn.prepareStatement(countSql);
				pstmt.setInt(1, boardNo); //pstmt에 매개변수를 설정 했어야 했음. 이 쿼리가없어서 오류
				rs = pstmt.executeQuery();	//select 실행
				if(rs.next()) {
					resultRow = rs.getInt(1); // count(*)값 가져오기
					
					if(resultRow == 0) {
						System.out.println("삭제할 게시글 번호가 없습니다.");
						return;
					}
				}				
				//sql 실행
				pstmt = conn.prepareStatement(deleteOneSql);
				pstmt.setInt(1, boardNo); //pstmt에 매개변수를 설정 했어야 했음. 이 쿼리가없어서 오류
				resultRow = pstmt.executeUpdate();	//delete 실행
								
				System.out.println("게시글 번호" + boardNo + "를 성공적으로 삭제하였습니다.");
				//삭제는 전삭이랑 개별삭제가 있는데 전삭은 admin같은 관리자개념에서 삭제. 여기선 자기것만.		
			}catch(SQLException se) {
				System.out.println("게시글을 삭제하는 도중 에러가 발생 -> " + se.getMessage());
			}finally {
				DBManager.dbClose(conn, pstmt, rs);
			}
			
		}
		
	}

