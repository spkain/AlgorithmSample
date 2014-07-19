#include <iostream>
#include <stdint.h>

uint32_t xor_shift(void) {
	static uint32_t x = 123456789;
	static uint32_t y = 362436069;
	static uint32_t z = 521288629;
	static uint32_t w = 8875123;

	static uint32_t t;
	
	t = x ^ (x << 11);
	x = y; y = z; z = w;
	return w = (w ^ (w >> 19)) ^ (t ^ (t >> 8));
}

int main(void) {

	uint32_t rand;
	
	for (int i = 0; i < 10; i++) {
		rand = xor_shift();

		printf("%10lu\n", rand);
	}
	getchar();
	return 0;
}