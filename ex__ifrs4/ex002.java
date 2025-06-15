package ex__ifrs4;

public class ex002 {
    public static long fatorial(int n){
        long fatorial = 1;
        for (int i = 2; i <= n; i++){
            fatorial *= i;
        }
        return fatorial;
    }
    public static void main (String[]args){
        int x;
        double soma=0;

        System.out.print("Digite o valor de x: ");
        x = Integer.parseInt(System.console().readLine());

        for (int i = 0; i <= 15; i++){
            soma += (Math.pow(x,i)/fatorial(i));
        }
        System.out.printf("e^x ≈ %.2f",soma);
    }
}
