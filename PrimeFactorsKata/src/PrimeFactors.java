public class PrimeFactors {
	
	int count = 0;
	int [] factors = new int[10];


	public Object findPrimeFactors(Object number) {
		
		if (number.equals(1)) return new int[0];
		
		if ((int)number > 1) {
			if ((int)number % 2 == 0) {
				count = count + 1;
				factors[count] = 2;
				//count = count + 1;
				number = (int)number/2;
			}
			if ((int)number > 1) {
				count = count + 1;
				factors[count] = (int)number;
				//count = count + 1;
			}
		}
		
		return factors;
	}



}
