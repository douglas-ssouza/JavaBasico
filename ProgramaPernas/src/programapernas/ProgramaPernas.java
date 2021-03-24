package programapernas;

import java.util.Scanner;

public class ProgramaPernas {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Qual o número de pernas? ");
        int pernas = input.nextInt();
        String tipo;
        
        switch(pernas){
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
            case 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "E.T";
                break;
        }
        
        System.out.println(tipo);
        
        
    }
    
}
