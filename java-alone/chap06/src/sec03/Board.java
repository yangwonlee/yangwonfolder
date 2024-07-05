package sec03;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	public Board(String title, String content){
		this(title, content, "홍길동", "2024-05-27", 0);
		
	}
	public Board(String title, String content, String writer){
		this(title, content, writer, "2024-05-27", 0);
	
	}
	
	public Board(String title, String content, String writer, String date){
		this(title, content, writer, date, 0);
		
	
	}
	
	public Board(String title, String content, String writer, String date, int hitcount){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
	}

	
}
