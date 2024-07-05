package sec02;

public class Message {
	public String command; //메시지 명령어
	public String to;  // 누구에게 전달할 것인지를 정하는 메시지 전달 대상
	
	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}
}
