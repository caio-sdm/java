package ifrs2;

public class ex002 {
    public static void main(String[]args){
        int soma, somquad, n, numeros;
        double media;
        soma = 0;
        somquad = 0;
        media = 0;
        numeros = 0;

        System.out.println("Para parar, digite um número negativo");

        do {
            System.out.print("Digite um número inteiro: ");
            n = Integer.parseInt(System.console().readLine());

            if (n>=0){
                numeros+= 1;
                soma += n;
                somquad += (int) Math.pow(n,2);
            }

        } while (n >= 0);
        media += (double) soma / numeros;

        System.out.printf("Soma: %d \nSoma de quadrados: %d \nMédia: %.2f\n",soma,somquad,media);
    }
}
