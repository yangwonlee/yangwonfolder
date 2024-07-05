package sec01;

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDOg(dog);
		
		Cat cat = new Cat();
		changeDog(cat);

	}
	
	public static void changeDog(Animal animal) {
		// if(animal instatnceof Dog) {
			Dog dog = (Dog) animal; // ClassCastExcetption 발생가능
	}

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}