package programamedia;

import java.util.Scanner;
/**
 *
 * @author Douglas
 */
public class ProgramaMedia {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        float n1, n2, media;
        
        System.out.print("Primeira nota: ");
        n1 = input.nextFloat();
        System.out.println("Segunda nota: ");
        n2 = input.nextFloat();
        media = (n1 + n2) / 2;
        
        System.out.println("Media: " + media);
        
        if (media > 9){
            System.out.println("Parabéns");
        }
    }
    
}
