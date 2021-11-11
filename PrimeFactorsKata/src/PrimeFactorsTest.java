import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class PrimeFactorsTest {

	PrimeFactors prime = new PrimeFactors();
	int [] primeFactores = {2,2};
	int [] primeFactor = {};
	
	@DataProvider (name = "data-provider")
    public Object[][] dpMethod(){
	 return new Object[][] {
		 {new int [0], 1}, {2, 2}, {3,3}, {primeFactores, 4}};
    }
	
	@Test (dataProvider = "data-provider")
	public void testcases (Object val, Object number) {
	  assertEquals(val, prime.findPrimeFactors(number));
	}

}