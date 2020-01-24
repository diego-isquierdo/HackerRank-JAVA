package HackerRank;

import java.util.Scanner;

public class StaticInicializer {
	static Scanner scan = new Scanner(System.in);
	
	static int B = scan.nextInt();
	static int H = scan.nextInt();
	
	
	static boolean flag =testaFlag(B,H);
	
	static boolean testaFlag(int base, int altura) {
		if (base>0 && altura>0) {
			return true;
		}
		System.out.println("java.lang.Exception: Breadth and height must be positive");
		return false;
	}
	
	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}//end of main

}//end of class
