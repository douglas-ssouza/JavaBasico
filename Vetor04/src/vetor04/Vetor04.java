package vetor04;

import java.util.Arrays;
/**
 *
 * @author Douglas
 */
public class Vetor04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor[] = {3, 7, 6, 1, 9, 4, 2};
        
        for (int valor: vetor){
            System.out.print(valor + " ");
        }
        System.out.println("");
        int p = Arrays.binarySearch(vetor, 9);
        System.out.println("Encontrei o valor na posição " + p);
        
        
    }
    
}
