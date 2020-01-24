package HackerRank;

/**
 Pattern.compile(pattern) >> testa se a string compila
 caso não compile.. try/catch trata a exception e imprime invalid
 **/


import java.util.regex.Pattern;

public class SyntaxChecher {
	public static void main(String[] args) {
		int testCases = 3;
		String pattern = "([A-Z])(.+)";
		//String pattern = "[AZ[a-z](a-z)";
		while(testCases>0) {
	           try {
	                Pattern.compile(pattern);
	                System.out.println("Valid");
	            } catch (Exception e) {
	                System.out.println("Invalid");
	            }
			testCases --;
		}
	}
}
