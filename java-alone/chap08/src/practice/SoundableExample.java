package practice;

public class SoundableExample {
	private static void printSound(Soundable soundable) {
	System.out.println(soundable.sound());
	}				//인수는 사운드.
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	System.out.println("멍멍");
	}

}
