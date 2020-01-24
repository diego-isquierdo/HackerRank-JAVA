import java.util.Scanner;

/**
 *  (a  + 2**0 x b) n vezes
 * @author TheLeft
 *
 */

public class Potencia {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int aux=0;
            int auxSoma=a;
            while(aux<n){
                auxSoma = auxSoma + ((int)Math.pow(2,aux)*b);
                System.out.print(auxSoma + " ");
                aux++;
            }
            System.out.println("");
        }
        in.close();
  
}
}
