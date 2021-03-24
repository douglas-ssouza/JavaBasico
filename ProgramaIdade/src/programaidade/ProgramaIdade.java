package programaidade;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class ProgramaIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nasc, idade;
        
        System.out.print("Informe o ano de nascimento: ");
        nasc = input.nextInt();
        idade = 2021 - nasc;
        
        System.out.println("Sua idade é " + idade);
        
        if (idade >= 18){
            System.out.println("Maior");
        }else{
            System.out.println("Menor");
        }
    }
    
}
