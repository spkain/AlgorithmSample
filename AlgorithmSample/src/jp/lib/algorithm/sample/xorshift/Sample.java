package jp.lib.algorithm.sample.xorshift;

public class Sample {

	public static void main(String[] args) {
		int seed = (int)System.currentTimeMillis();
		XorShift shift = new XorShift(seed);
		int randtry = 1000;
		int randmax = 5;
		int randint = 0;

		for (int i = 0; i < randtry; i++) {
			randint = shift.rand() % randmax;
			System.out.println(randint);
		}
	}
}
