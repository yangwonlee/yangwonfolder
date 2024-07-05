package practice;

	import java.util.ArrayList;
	import java.util.List;
	
	public class BoardDao{
		// 실행결과
					//제목1-내용1
					//제목2-내용2
					//제목3-내용3
		public List<Board> getBoardList(){ //리스트 이그젬플의 보드는 리턴값. 이걸 가져와서 선언
			List<Board> boardList = new ArrayList<>();
			Board board1 = new Board("제목1" , "내용1");
			boardList.add(board1);
			Board board2 = new Board("제목2" , "내용2");
			boardList.add(board1);
			Board board3 = new Board("제목3" , "내용3");
			boardList.add(board1);
		
			return boardList;
			// 깡통 리스트.
		}
		
		
		
}
