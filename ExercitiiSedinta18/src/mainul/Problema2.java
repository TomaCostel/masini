package mainul;

import java.util.Scanner;

public class Problema2 {
	public static void main(String[] args) {

		Scanner ri = new Scanner(System.in);

		System.out.print("Nr: ");
		int num = ri.nextInt();

		String nr = (num % 2 == 0) ? "Par" : "impar";

		System.out.println(num + " is " + nr);

	}
}