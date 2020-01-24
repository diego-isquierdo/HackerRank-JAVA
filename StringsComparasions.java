package HackerRank;

public class StringsComparasions {
	public static void main(String[] args) {
		String smallest = "";
	    String largest = "";
	    String sAux = "";
		String s = "welcometojava";
		int k = 3;
		int count = 0;
		
		while(count <= s.length()-k) {
			sAux = s.substring(count, count+k);
			
			if(count==0) {
				smallest = sAux;
				largest = sAux;
			}
			
			if((sAux.compareTo(smallest))<0) smallest=sAux;
			if((sAux.compareTo(largest)>0)) largest=sAux;
			
			count ++;
		}
		
		System.out.println(smallest + " " + largest);
	}
}
