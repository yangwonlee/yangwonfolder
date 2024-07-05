package sec02;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
	// run에서 run configuration을 누르고 argument를 누르고 빈칸에 10 20을 치면
//"값의 수가 부족합니다." 대신 계산이 나옴.