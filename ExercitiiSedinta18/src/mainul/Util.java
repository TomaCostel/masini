package mainul;

import java.util.Scanner;

public class Util {

	static int arr[] = { 10, 324, 45, 90, 9808 };

	static int findlargest() throws ArrayIndexOutOfBoundsException {
		int i;
		int max = arr[4];

		System.out.println(max);

		for (i = 1; i <= arr.length; i++) {
			{
				if (arr[i] < max)
					break;

			}
		}
		return max;

	}

	public static void main(String[] args) {

		System.out.println("Largest in given array is " + findlargest());

	}

	

}
