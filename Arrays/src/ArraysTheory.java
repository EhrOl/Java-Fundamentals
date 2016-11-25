public class ArraysTheory {

	public static void main(String[] args) {
		int[] talen = new int[5];

		talen[0] = 4;
		talen[1] = 2;
		talen[2] = 89;
		talen[3] = 45;
		talen[4] = 6;

		int min = 0;
		int max = 0;
		for (int i = 0; i < talen.length; i++) {
			if (talen[i] < talen[min]) {
				min = i;
			} else if (talen[i] > talen[max]) {
				max = i;
			}
		}
		System.out.println(talen[min]);
		System.out.println(talen[max]);
	}
}