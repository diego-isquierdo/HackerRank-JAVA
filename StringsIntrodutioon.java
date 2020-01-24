package HackerRank;

import java.util.Scanner;

public class StringsIntrodutioon {
	public static void main(String[] args) {
	        
    	Scanner sc=new Scanner(System.in);
        String A= "hello";//sc.next();
        String B="java";//sc.next();
        /* Enter your code here. Print output to STDOUT. */
	    System.out.println(A.length()+B.length());
	    if (A.compareTo(B)<=0) {
	    	System.out.println("No");
	    }else {
	    	System.out.println("Yes");
	    }
	    String Aa = (A.substring(0,1).toUpperCase().concat(A.substring(1)));
	    String Bb = (B.substring(0, 1).toUpperCase().concat(B.substring(1)));
	    System.out.println(Aa + " " + Bb);
	}
}
