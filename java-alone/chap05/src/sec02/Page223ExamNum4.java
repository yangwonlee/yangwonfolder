package sec02;

public class Page223ExamNum4 {
 public static void main(String[] args) {
	int max = 0;
	int[] array= {1, 5, 3, 8, 2 };	// 하나씩 비교해서 가장 큰걸 나오게해야함. 순회해서.
	
	for(int i = 0; i < array.length; i++) {
		if(max < array[i]) {	//만약 맥스가 어레이의 i보다 작다면
			max = array[i];
		}
		
	}
			
		 System.out.println("max: " + max);
		
	 
 }
}
