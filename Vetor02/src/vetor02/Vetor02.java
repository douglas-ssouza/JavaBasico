package vetor02;
public class Vetor02 {
    public static void main(String[] args) {
        // TODO code application logic here
        String ano[] = {"JAN", "FEV", "MAR", "ABR", "MAI", "JUN", 
            "JUL", "AGO", "SET", "OUT", "NOV", "DEZ"};
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for (int i = 0; i < ano.length; i++){
            System.out.println("O mês de " + ano[i] + " tem " + dias[i] + " dias");
        }
    }
    
}
