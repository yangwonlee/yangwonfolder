package reviewUntilt100Page;

public class Page77 {
	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2;
			v2 = v1 - 10;
		}
		int v3 = v1 + v2 +5; //v2 변수를 사용할 수 없음. 왜냐면 v2는 if문에서만 사용될 수 있기에.
	}
}
