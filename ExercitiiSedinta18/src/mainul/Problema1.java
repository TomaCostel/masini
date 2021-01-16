package mainul;

public class Problema1 {

	static int arr[] = { 10, 324, 45, 90, 9808 };

	static int findlargest() {
		int i;
		int max = arr[0];

		for (i = 1; i < arr.length; i++) {

			int elementulCurent = arr[i];
			if (elementulCurent > max)
				max = arr[i];
			
		}
		return max;

	}

	public static void main(String[] args) {

		System.out.println("Largest in given array is " + findlargest());

	}
}
