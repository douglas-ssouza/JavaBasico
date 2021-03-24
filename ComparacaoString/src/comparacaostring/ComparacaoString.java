package comparacaostring;

/**
 * @author Douglas
 * @date 08/01/2021
 * @name Comparação Strings
 */
public class ComparacaoString {

    public static void main(String[] args) {
        
        String nome1 = "Douglas";
        String nome2 = "Douglas";
        String nome3 = new String("Douglas");
        String res;
        
        res = (nome1.equals(nome3)) ? "igual" : "diferente";
        
        System.out.println(res);
    }
    
}
