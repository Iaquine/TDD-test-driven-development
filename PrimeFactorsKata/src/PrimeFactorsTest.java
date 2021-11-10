import static org.testng.Assert.assertEquals;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

class PrimeFactorsTest {

	PrimeFactors prime = new PrimeFactors();
	int [] primeFactores = new int [0];
	
	
	@DataProvider (name = "data-provider")
    public Object[][] dpMethod(){
	 return new Object[][] {{new int [0]}};
    }
	
	@Test (dataProvider = "data-provider")
	public void returnNoneFor1 (Object val) {
	  assertEquals(val, prime.findPrimeFactors(1));
	}

}
