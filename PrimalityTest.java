package HackerRank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Verifica se o n�mero � primo atrav�s da classe BigInteger | m�todo isProbablePrime
 * */

public class PrimalityTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		BigInteger m = scanner.nextBigInteger();
		
		System.out.println(m.isProbablePrime(1)?"prime" : "not prime");
	}
}


