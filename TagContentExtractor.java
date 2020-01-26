package HackerRank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
	public static void main(String[] args){
		String line = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
		String regex=("<(.+)>([^<>]+)</\\1>");

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(line);
		
		boolean testaNone = false;
				
		while(matcher.find()) {
			String aux  = matcher.group(2);
			System.out.println(aux);
			testaNone = true;
		}
			if(!testaNone) System.out.println("None");


		
//		Scanner in = new Scanner(System.in);
//		int testCases = Integer.parseInt(in.nextLine());
//		while(testCases>0){
//			String line = in.nextLine();
//			
//          	//Write your code here
//			if(true) {
//				
//			}else {
//				System.out.println("None");
//			}
//			
//			testCases--;
//		}
	}
}
