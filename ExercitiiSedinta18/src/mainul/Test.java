package mainul;

public class Test {

	static int biggestOfThree(int x, int y, int z) {
		return z > (x > y ? x : y) ? z : ((x < y) ? x : y);

	}

}
