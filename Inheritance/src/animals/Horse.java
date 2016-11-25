package animals;

public class Horse extends Animal {

	public Horse() {
		System.out.println("Hello from constructor in the Horse class");
	}

	@Override
	public void eat() {
		System.out.println("A horse eats");
	}

	@Override
	public void makeNoise() {
		System.out.println("\nA horse neighs");
	}
//	@Override
//	public void sleep() {
//		System.out.println("A horse sleeps\n");
//	}
}
