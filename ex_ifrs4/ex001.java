package ex_ifrs4;

public class ex001 {
     public static long fatorial(int n){
         long fatorial = 1;
         for (int i = 2; i <= n; i++){
             fatorial *= i;
         }
         return fatorial;
     }
     public static void main (String[]args){
         double soma = 0;

         for (int k = 0; k <= 20; k++){
             double n = (100.0 - k) / fatorial(k);
             soma += n;
         }
         System.out.printf("A soma da série é igual a: %.3f\n", soma);
     }
}
