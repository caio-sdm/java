package ifrs3.ex004;

public class ex004 {
    public static void main (String[]args){
        int n, soma, somaquad, i;
        soma = 0;
        somaquad = 0;
        i=0;

        System.out.println("Para parar, digite um número negativo: ");

        System.out.print("Digite um número: ");
        n = Integer.parseInt(System.console().readLine());

        for (; n >= 0;){
            soma += n;
            somaquad += n*n;
            i++;

            System.out.print("Digite um número: ");
            n = Integer.parseInt(System.console().readLine());
        }

        double media = (i > 0)?(double) soma/i:0;

        System.out.printf("Soma: %d\nSoma dos quadrados: %d\nMédia: %.2f",soma,somaquad,media);
    }
}
