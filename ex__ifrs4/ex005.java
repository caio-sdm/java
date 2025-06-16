package ex__ifrs4;

public class ex005 {
    public static int mmc(int a, int b){
        int maior = Math.max(a,b);
        while (true){
            if (maior % a == 0 && maior % b == 0){
                return maior;
            }
            maior++;
        }
    }
    public static int numerador(int n1, int d1, int n2, int d2, int dr){
        return (dr / d1) * n1 + (dr / d2) * n2;
    }

    public static void main (String[]args){
        System.out.print("Digite o numerador da primeira fração: ");
        int n1 = Integer.parseInt(System.console().readLine());

        System.out.print("Digite o denominador da primeira fração :");
        int d1 = Integer.parseInt(System.console().readLine());

        System.out.print("Digite o numerador da segunda fração: ");
        int n2 = Integer.parseInt(System.console().readLine());

        System.out.print("Digite o denominador da segunda fração :");
        int d2 = Integer.parseInt(System.console().readLine());

        int dr = mmc(d1, d2);
        int nr = numerador(n1,d1,n2,d2,dr);

        System.out.printf("Resultado da soma: %d / %d",nr,dr);
    }
}
