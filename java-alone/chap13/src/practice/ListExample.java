package practice;

import java.util.List;

public class ListExample {
	
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> List = dao.getBoardList(); //getboardlist= 메소드.
		for(Board board : List) {
			System.out.println(board.getTitle() + " - " + board.getContent());
		}

	}

}
