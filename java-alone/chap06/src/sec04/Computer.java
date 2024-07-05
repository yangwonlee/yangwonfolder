package sec04;

public class Computer {
	int sum1(int[] values) {
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
    }
	
	int sum2(int... values) { // ... 뒤에 밸류즈. ...을 쓰면 밑에 .length사용가능.
		int sum = 0;
		for(int i = 0; i<values.length; i++) {
			sum += values[i];
		}
		return sum;
	}
	
}
	
