package mainul;

public class Problema4 {

	static int biggestOfThree(int x, int y, int z) {
		 return z > (x > y ? x : y) ? z : ((x < y) ? y : x);
	/*	if (x > y && x > z) {
			return x;
		}
		if (y > x && y > z) {
			return y;
		}
		return z;
	}
	
*/}
		
	public static void main(String[] args) {
		int a, b, c;
		int big;

		a = 5;
		b = 10;
		c = 3;
		int largest = Problema4.biggestOfThree(a, b, c);
		System.out.println(largest + " is the largest number.");

	}
}
