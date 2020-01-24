package HackerRank;

public class Anagramas {
	public static void main(String[] args) {
		String a = "anagram";
		String b = "margana";
		boolean resposta = true;
		
		a=a.toLowerCase();
        b=b.toLowerCase();

	     int countA = 0;
	        int countB = 0;
	        boolean flag;
	        
	        if(a.length()==b.length()){
	            for(int i=0; i<a.length(); i++) {
	                flag=false;
	                for(int j=0; j<a.length(); j++) {
	                    if(a.charAt(i)==b.charAt(j)) {
	                            for(int x=0; x<a.length(); x++) {
	                                if(a.charAt(i)==a.charAt(x)) countA ++;
	                                if(b.charAt(j)==b.charAt(x)) countB ++;
	                                flag = true;
	                            }
	                        }
	                        
	                    }
	                if((countA != countB)||flag==false) resposta = false;
	                    countA=0;
	                    countB=0;
	                }
	            }else{resposta = false;}
	        resposta = true;
	        }
}

