package animals;

public class Cat extends Animal {

	public Cat() {
		System.out.println("Hello from the constructor in the Cat class");
	}
	
	@Override
	public void makeNoise() {
		System.out.println("A cat meows");
	}
	
//	@Override
//	public void eat() {
//	System.out.println("A cat eats");
//}
//	@Override
//	public void sleep() {
//		System.out.println("A cat sleeps");
//	}

}
