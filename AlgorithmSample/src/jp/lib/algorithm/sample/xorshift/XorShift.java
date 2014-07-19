package jp.lib.algorithm.sample.xorshift;

import java.util.Random;

public class XorShift {

	private Random rand;
	private int seed;
	private int y, z, w;

	public XorShift(int seed) {
		if (seed < 0) {
			this.seed = 123456789;
		}
		this.seed = seed;

		this.y = 309833908;
		this.z = 502832039;
		this.w = 98023713;

		rand = new Random(seed);
	}

	public int rand() {
		int t = this.seed ^ (this.seed << 11);
		this.seed = this.y; this.y = this.z; this.z = this.w;
		return this.w = (this.w ^ (this.w >> 19) ^ (t ^ (t >> 8)));

	}

}
