import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HashSetCalcTestCase {

	@Test
	void hash1() {
		int[] xs = {10,22,34,23,51};
		HashSetCalc.arr = new int[5];
		HashSetCalc.m = 5;
		HashSetCalc.hashTestCase(xs);
        assertEquals(HashSetCalc.arr[0], 10);
        assertEquals(HashSetCalc.arr[1], 51);
        assertEquals(HashSetCalc.arr[2], 22);
        assertEquals(HashSetCalc.arr[3], 23);
        assertEquals(HashSetCalc.arr[4], 34);
	}
	
	@Test
	void hash2() {
		int[] xs = {53,32,33,26,54};
		HashSetCalc.arr = new int[5];
		HashSetCalc.m = 5;
		HashSetCalc.hashTestCase(xs);
        assertEquals(HashSetCalc.arr[0], 0);
        assertEquals(HashSetCalc.arr[1], 26);
        assertEquals(HashSetCalc.arr[2], 32);
        assertEquals(HashSetCalc.arr[3], 33);
        assertEquals(HashSetCalc.arr[4], 54);
	}

}
