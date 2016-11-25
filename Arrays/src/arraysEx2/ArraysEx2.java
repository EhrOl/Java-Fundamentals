package arraysEx2;

import java.util.Scanner;

public class ArraysEx2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers would you like to input?");
		int[] valuesInArray = new int[sc.nextInt()];
		int sum = 0;

		for (int indexInArray = 0; indexInArray < valuesInArray.length; indexInArray++) {
			System.out.println("Please input number:");
			valuesInArray[indexInArray] = sc.nextInt();
			sc.nextLine();
			sum += valuesInArray[indexInArray];
		}
		System.out.println("Your array contains " + valuesInArray.length + " numbers.");
		System.out.println("The sum of the numbers in your array is " + sum);
		
		sc.close();
	}
}