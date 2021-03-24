package vetor03;

import java.util.Arrays;

public class Vetor03 {
    public static void main(String[] args) {
        // TODO code application logic here
        float v[] = {3.5f, 2.75f, 9f, -4.5f};
        Arrays.sort(v);
        for (float valor: v){
            System.out.print(valor + " ");
        }
    }
    
}
