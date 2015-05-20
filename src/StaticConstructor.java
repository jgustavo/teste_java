import java.math.BigInteger;
import java.util.Random;


public class StaticConstructor {

	private static BigInteger probablePrime;
	private static Boolean valueOf;

	public static void main(String[] args) {
		Random rnd = new Random();
		probablePrime = BigInteger.probablePrime(32, rnd);
		
		valueOf = Boolean.valueOf(false);
		
		
		

	}

}
