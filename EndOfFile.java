package HackerRank;

import java.util.Scanner;

public class EndOfFile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
				
        int count = 1;

        while(scan.hasNext()) {
            String linha = scan.nextLine();
            System.out.println(count + " " + linha);
            count++;
        }
		
		scan.close();
	}
}
