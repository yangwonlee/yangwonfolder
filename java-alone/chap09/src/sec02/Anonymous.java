package sec02;

public class Anonymous {
	Person person1 = new Person(); //일반 개체
	Person person2 = new Person() { //익명 개체
		void work() {
			
		}
		
		@Override
		void wake() {
			
		}
	};
}
