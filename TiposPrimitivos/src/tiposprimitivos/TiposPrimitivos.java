package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author Douglas
 */
public class TiposPrimitivos {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = input.nextFloat();
        
        System.out.println("A nota é " + nota);
        System.out.printf("A nota de %s é %.2f\n", nome, nota);
        System.out.format("A nota de %s é %.2f\n", nome, nota);
    }
    
}
