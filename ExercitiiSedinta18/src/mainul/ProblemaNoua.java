package mainul;

public class ProblemaNoua {

	static int arr[] = { 10, 324, 45, 90, 9808 };

	static int numarDeNumerePare() {
		int i;
		int numarImpar;
		int count = 0;
		int suma = 0;
		int suma2 = 0;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
				suma = arr[i] + suma;
				System.out.println("am gasit un numar par care este =" + arr[i]);
			} else
				suma2 = arr[i] + suma2;
		}
		System.out.println("Suma nr pare  este " + suma);
		System.out.println("Suma nr impare este " + suma2);
		return count;

	}

	public static void main(String[] args) {

		System.out.println("Largest in given array is " + numarDeNumerePare());

	}
}
