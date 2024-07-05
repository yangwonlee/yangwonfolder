package sec02;

public class ForSumFrom1To100Example1 {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			sum +=i;	
		}
		System.out.println("1~100 합 : " +sum);

		for (int j = 0, k = 100; j<= 50 && k >=50; j++, k--) {
			//이러한 코딩도 가능. 하지만 헷갈려서 보통 위에것을 사용.
		}
		
		for(int j = 0; ; j++) {
			
		}
		
	}
}	
	

