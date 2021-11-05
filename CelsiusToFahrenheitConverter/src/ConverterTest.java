import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ConverterTest {

	Converter con = new Converter();

	@Test
	@DisplayName("Tests if the right temperature is been returned") 
	public void getConvertedTemperature() {
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
