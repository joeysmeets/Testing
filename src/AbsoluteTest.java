import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AbsoluteTest {
	
	
	@BeforeEach
	void setUp() throws Exception {
		
	}

	@Test
	void testPositive() {
		assertEquals(10, Absolute.absoluteValueOf(10));
	}

	@Test
	void testNegative() {
		assertEquals(7, Absolute.absoluteValueOf(-7));
	}
	
	@Test
	void testNeutral() {
		assertEquals("Testing the white box method", Absolute.absoluteValueOf("Testing the white box method")); 
	}
}
