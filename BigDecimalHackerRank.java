package HackerRank;

import java.math.BigDecimal;

/**
 * Ordena uma String com valores BigDecimal
 * */

public class BigDecimalHackerRank {
	public static void main(String[] args) {
		int n= 9;
		String []s= {"-100" ,"50", "0", "56.6", "90", "0.12", ".12", "02.34","000.000"};
		
		
	for(int j=0; j<n; j++) {
			for(int i=0; i<n-1; i++) {
				BigDecimal testa1 = new BigDecimal(s[i]);
				BigDecimal testa2 = new BigDecimal(s[i+1]);
				if(testa1.compareTo(testa2)<0) {
					String aux = s[i];
					s[i]=s[i+1];
					s[i+1] = aux;
				}
			}
		}
		for (String i:s) {
			System.out.println(i);
		}
		
	}
}
