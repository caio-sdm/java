package ifrs4;

public class ex001 {
    public static void main (String[]args){
        double n, sqrt;
        n = 1;

        do{
            sqrt = Math.sqrt(n);
            System.out.printf("A raíz quadrada de %.0f é igual a %.2f\n",n,sqrt);
            n++;
        }while (n <= 100);
    }
}
