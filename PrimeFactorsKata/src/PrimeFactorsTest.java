import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrimeFactorsTest {

	PrimeFactors prime = new PrimeFactors();
	
	@Test
	@DisplayName("return none for 1")
	void returnNoneFor1() {
		assertEquals(null, prime.findPrimeFactors(1));
	}

}
