package sec01.exam04;

public class VariableScopeExample {
	public static  void main(String[] args) {
		int v1 = 15;
		
		if(v1 > 10) {
			int v2;
			v2 = v1 - 10;
		}
	//int v3 = v1 +v2 +5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김.
	// 왜냐하면 중괄호 블록 내에서 선언된 변수는 해당 중괄호 {}내에서만 사용이 가능.	
	}
}
// 워닝. 잠재적 오류.  노란색 불이 들어옴. 컴파일하는데 문제가 되진 않지만 이클립스에서
// 인공지능에서 가이드를 해줌. vs코드나 인텔리제이에도 다 있음.
// 변수는 숫자로 시작 불가. class등 예약어들은 변수이름으로 사용불가.
// 달러와 언더바는 특수기호중에서 유이하게 사용가능.