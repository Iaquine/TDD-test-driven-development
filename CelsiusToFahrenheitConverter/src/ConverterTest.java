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
		
		convertedTemp = con.converTemp(32);
		assertEquals(0,convertedTemp);
		
		convertedTemp = con.converTemp(50);
		assertEquals(10,convertedTemp);
		
		convertedTemp = con.converTemp(212);
		assertEquals(100,convertedTemp);
		
		convertedTemp = con.converTemp(-40);
		assertEquals(-40,convertedTemp);
		
		convertedTemp = con.converTemp(-459.67);
		assertEquals(-273.15,convertedTemp);
	}

}
