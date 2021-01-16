package mainul;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		  Util.findlargest();
		  
		  {
		  
		  Scanner ri = new Scanner(System.in);
		  
		  System.out.print("Nr: "); int num = ri.nextInt();
		  
		  String nr = (num % 2 == 0) ? "Par" : "impar";
		  
		  System.out.println(num + " is " + nr);
		  
		  }
		 

		{
			System.out.println("introduceti numarul");
			Scanner y = new Scanner(System.in);
			int num = y.nextInt();

			int i = 1;
			long factorial = 1;
			while (i <= num) {
				factorial *= i;
				i++;
			}
			System.out.printf("Factorul lui%d = %d", num, factorial);

			int a, b, c;
			int big;

			a = 10;
			b = 10;
			c = 3;
			int largest = Test.biggestOfThree(a, b, c);
			System.out.println(largest + " is the largest number.");

		}

	}
}