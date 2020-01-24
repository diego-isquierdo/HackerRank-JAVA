package HackerRank;

public class StringsTokens {
	public static void main(String[] args) {
		String s = " a";
		
		if(s.trim().length()!=0) {
			String[] vet = s.trim().split("[@	#$%&*()\\_´^¨}={`ªº/>|< ,!?'.]+");
			System.out.println(vet.length);
			
			for(String a:vet) {
				System.out.println(a);
			}
		}else {
			System.out.println(0);
		}
	}
}
