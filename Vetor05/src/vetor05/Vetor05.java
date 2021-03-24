package vetor05;

import java.util.Arrays;

/**
 *
 * @author Douglas
 */
public class Vetor05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int vetor[] = new int[20];
        Arrays.fill(vetor, 0);
        for (int valor: vetor) {
            System.out.print(valor + " ");
        }
        
    }
    
}
