package arraysEx3;

import java.text.NumberFormat;
import java.util.Scanner;

public class ArraysEx3 {

	static Scanner sc = new Scanner(System.in);
	static int[] value;
	static int index;
	static int sum;

	public static void createTheArray() {
		System.out
				.print("You're creating array! Please choose how many numbers would you like to have in your array: ");
		value = new int[sc.nextInt()];
		System.out.println();
	}

	public static void fillArray() {
		for (index = 0; index < value.length; index++) {
			System.out.print("Please input the value for position " + index + ": ");
			value[index] = sc.nextInt();
		}
		System.out.println();
	}

	public static void printArray() {
		for (index = 0; index < value.length; index++) {
			System.out.println("The value for position " + index + " is " + value[index]);
		}
		System.out.println();
	}

	public static void sumElements() {
		for (index = 0; index < value.length; index++) {
			sum = value[index] + sum;
		}
		System.out.println("The sum of the elements of the array is " + sum);
		System.out.println();
	}

	public static void averageOfElement() {
		double average = (double) sum / value.length;
		System.out.printf("The average value of the elements of the array is %.2f", average);
	}
}