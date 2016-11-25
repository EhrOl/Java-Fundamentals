package arrayList;

import java.util.*;

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		// is the same as:
		// ArrayList<String> names = new ArrayList<String>();

		// ADD METHOD:
		names.add("Olga");
		names.add("Hanna");
		names.add("Elissa");
		names.add(1, "Bruna");

		// GET METHOD:
		System.out.println("element 0: " + names.get(0));
		System.out.println("element 1: " + names.get(1));
		System.out.println("element 2: " + names.get(2));

		// SET METHOD:
		names.set(1, "Razieh");
		System.out.println("element 1 is now: " + names.get(1));

		// REMOVE METHOD:
		names.remove("Razieh");
		names.remove(2);

		for (String a : names) {
			System.out.println(a);
		}

		System.out.println("initial size: " + names.size());
		names.add("Bita");
		names.add("Bardia");
		names.add("Ulf");
		System.out.println("new size: " + names.size());
		for(int j = 0; j<names.size(); j++) {
			System.out.println("element " + j + ": " + names.get(j));
		}

	}

}
