import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbsoluteTest {
	
	
	@BeforeEach
	void setUp() throws Exception {
		
	}
	
	@Test
	void testNegativeBig() {
		assertEquals(123456, Absolute.absoluteValueOf(-123456));
	}
	
	@Test
	void testNegative16() {
		assertEquals(16, Absolute.absoluteValueOf(-16));
	}
	
	@Test
	void testNegative8() {
		assertEquals(8, Absolute.absoluteValueOf(-8));
	}
	
	@Test
	void testMinusOne() {
		assertEquals(1, Absolute.absoluteValueOf(-1));
	}
	
	@Test
	void testZero() {
		assertEquals(0, Absolute.absoluteValueOf(0));
	}

	@Test
	void testPositive8() {
		assertEquals(8, Absolute.absoluteValueOf(8));
	}
	
	@Test
	void testPositive16() {
		assertEquals(16, Absolute.absoluteValueOf(16));
	}
	
	@Test
	void testPositiveBig() {
		assertEquals(123456, Absolute.absoluteValueOf(123456));
	}
	
	@Test
	void testChar() {
		assertNotEquals('Testing the white box method', Absolute.absoluteValueOf('Testing the white box method')); 
	}
	
	@Test
	void testString() {
		assertNotEquals("Testing the white box method", Absolute.absoluteValueOf("Testing the white box method")); 
	}
}
