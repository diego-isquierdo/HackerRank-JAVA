package HackerRank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormataMoeda {
	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double payment = scanner.nextDouble();
//        scanner.close();

        // Write your code here.
        String china = NumberFormat.getCurrencyInstance(new Locale("zh", "CN")).format(12324.134);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(12324.134);
        String france = NumberFormat.getCurrencyInstance(new Locale("fr", "FR")).format(12324.134);        
        String us = NumberFormat.getCurrencyInstance(new Locale("en", "US")).format(12324.134);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
	}
}
