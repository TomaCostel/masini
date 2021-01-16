package mainul;

import java.util.Scanner;

public class Problema3 {
	public static void main(String[] args) {

		

			int num = 4, i = 1;
			long factorial = 1;
			while (i <= num) {
				factorial *= i;
				i++;
			}
			System.out.printf("Factorul lui%d = %d", num, factorial);
		
	}
}