package mainul;

public class ProblemaNoua2 {

	static int arr[] = { 98080, 324, 45, 90, 9808 };

	static int numarDeNumerePare() {

		int count = 0;

		if (arr[0] % arr[arr.length - 1] == 0) {
			System.out.println("Numarul" + arr[0] + "se imparte exact la" + arr[arr.length - 1]);
		} else
			System.out.println("Numarul" + arr[0] + "NUU se imparte exact la" + arr[arr.length - 1]);
		return count;

	}

	public static void main(String[] args) {

		System.out.println("Largest in given array is " + numarDeNumerePare());

	}
}
