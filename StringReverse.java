package HackerRank;

public class StringReverse {
	public static void main(String[] args) {
		
		String A = "socorrammesubinoonibusemmarrocos";
		String resposta = "Yes";
		
		for(int i=0; i<A.length(); i++) {
			if(A.charAt(i)!=A.charAt(A.length()-(i+1))) resposta="No";
		}
		System.out.println(resposta);
	}
}
