package animals;

import java.util.ArrayList;

public class MainAnimal {

	public static void main(String[] args) {
		
		System.out.println("\nAnd now we create a cat:");
		Cat cat = new Cat();
		
		System.out.println("\nAnd now we create a horse:");
		Horse horse = new Horse();
		
		ArrayList <Animal> animals = new ArrayList<>();
		
		animals.add(horse);
		animals.add(cat);
		
		for (Animal an : animals) {
			an.makeNoise();
//			if(an instanceof Horse) {
//				((Horse)an).makeNoise();
//			}
//			else if(an instanceof Cat) {
//				((Cat)an).makeNoise();
//			}
			
		}
		
		
		
		

//		System.out.println("Now we create a horse:");
//		Animal animal = new Animal();
//		Horse horse = new Horse();
//		
//		System.out.println("And now we create a cat:");
//		Cat cat = new Cat();
//
//		animal.eat();
//		animal.sleep();
//		
//		horse.eat();
//		horse.sleep();
//		
//		horse.makeNoise();
//
//		if(horse instanceof Animal) {
//			Animal a = (Animal)horse;
//		}
//		cat.eat();
//		cat.sleep();
	}

}
