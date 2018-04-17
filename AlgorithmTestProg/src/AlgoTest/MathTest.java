package AlgoTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MathTest {
	MathOriginal math;

	@BeforeEach
	void setUp() throws Exception {
		math = new MathOriginal(2,3);
	}

	@Test
	void test() {
		assertTrue(math.add()==5,"message new");
		//Assert.assertEquals(3,math.add());
	}

}
