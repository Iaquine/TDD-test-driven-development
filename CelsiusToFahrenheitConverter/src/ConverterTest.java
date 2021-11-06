import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ConverterTest {

	
	
	Converter con = new Converter();

	@Nested
    @DisplayName("Tests if the right temperature is been returned")
    class getConvertedTemperature {
		
		@Test
		@DisplayName("to 32 returns 0")
		void to32returns0() {
			double convertedTemp = con.fahrenheitToCelsius(32.0);
			assertEquals(0,convertedTemp);
		}
		@Test
		@DisplayName("to 50 returns 10")
		void to50returns10() {
			double convertedTemp = con.fahrenheitToCelsius(50.0);
			assertEquals(10.0,convertedTemp);
		}
		
		@Test
		@DisplayName("to 212 returns 100")
		void to212returns100() {
			double convertedTemp = con.fahrenheitToCelsius(212.0);
			assertEquals(100.0,convertedTemp);
		}
		
		@Test
		@DisplayName("to -40 returns -40")
		void toMinus40returnsMinus40() {
			double convertedTemp = con.fahrenheitToCelsius(-40.0);
			assertEquals(-40.0,convertedTemp);
		}
		
		@Test
		@DisplayName("to -459.67 returns -273.15")
		void toMinus459returnsMinus273() {
			double convertedTemp = con.fahrenheitToCelsius(-459.67);
			assertEquals(-273.15,convertedTemp);
		}
		
	}
	
	
	//here the code is cleaner but doesn't all the tests in the suite
	@Test
	@DisplayName("Tests if the right temperature is been returned") 
	void getConvertedTemperature() {
		double convertedTemp = 0;
		
		convertedTemp = con.fahrenheitToCelsius(32.0);
		assertEquals(0,convertedTemp);
		
		convertedTemp = con.fahrenheitToCelsius(50.0);
		assertEquals(10.0,convertedTemp);
		
		convertedTemp = con.fahrenheitToCelsius(212.0);
		assertEquals(100.0,convertedTemp);
		
		convertedTemp = con.fahrenheitToCelsius(-40.0);
		assertEquals(-40.0,convertedTemp);
		
		convertedTemp = con.fahrenheitToCelsius(-459.67);
		assertEquals(-273.15,convertedTemp);
	}

}
