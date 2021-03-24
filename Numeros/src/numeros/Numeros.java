package numeros;

import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int n, s = 0;
        String res;
        
        do {
            System.out.print("Digite um número: ");
            n = input.nextInt();
            s += n;
            System.out.println("Quer continuar? [S/N]");
            res = input.next();
        } while (res.equalsIgnoreCase("S"));
        
        System.out.println("Soma total: " + s);
        
        
    }
    
}
