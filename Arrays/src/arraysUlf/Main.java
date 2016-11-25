package arraysUlf;

public class Main {

	public static void main(String[] args) {

		double[] novemberTemp;
		novemberTemp = new double[30];

		// There are two operations on the arrays: indexing and length

		novemberTemp[7] = 6.7; // indexing
		System.out.println(novemberTemp[6]); // default value
		System.out.println(novemberTemp[6] = 4.5);
		System.out.println(novemberTemp[6] + 7);

		for (int i = 0; i < novemberTemp.length; i++) { // length
			novemberTemp[i] = 0.0;
		}

		// BUT
		// for(double d : novemberTemp) {
		// d=0.0;
		// } THIS IS WRONG!!!

		for (double d : novemberTemp) { // ENCHANCED for-loop
			/*
			 * forEACH ( double d IN novemberTemp) { } DO THIS we go through the
			 * array and find all doubles and for example print them or do
			 * something with them
			 */

			System.out.println(d);
		}
	}
}
