package sec01.exam02;

public class VariableUseExample {

		public static void main(String[] args) {
			int hour = 3;
			int minute = 5;
			System.out.println(hour + "시간" + minute + "분");
			
			int totalMinute = (hour*60) + minute;
			System.out.println("총" + totalMinute + "분");
		}
}
 // 파이썬에서는 int 함수 이후에 "총"과 total은 타입이 같아야했음. 자바에서는
 //자동으로 변환해줌.
