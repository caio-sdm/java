package ex__ifrs1;
/*dado um valor 'bits', quantidades de cédulas para esse valor; caixa começa com 100 notas de cada; valor máximo por saque: 1000; termina ao digitar negativo ou limite de saques (100) */

public class ex013 {
    public static void main (String[]args){
        int valorbits, notas50=100, notas10=100, notas5=100, notas1=100, saques=0;

        System.out.print("========Ilhas Weblands========\n");
        System.out.print("Para parar, digite um valor negativo\n");

        while (saques < 100){
            System.out.print("Digite o valor a ser sacado: B$ ");
            valorbits = Integer.parseInt(System.console().readLine());

            if (valorbits < 0){
                System.out.print("Programa finalizado :D");
                break;
            }

            if (valorbits > 1000){
                System.out.print("O valor máximo permitido por saque é B$1.000,00\n");
                continue;
            }

            int qtd50 = Math.min(valorbits/50, notas50);
            valorbits -= qtd50 * 50;

            int qtd10 = Math.min(valorbits/10, notas10);
            valorbits -= qtd10 * 10;

            int qtd5 = Math.min(valorbits/5, notas5);
            valorbits -= qtd5 * 5;

            int qtd1 = Math.min(valorbits, notas1);
            valorbits -= qtd1;

            if (valorbits == 0){
                notas50 -= qtd50;
                notas10 -= qtd10;
                notas5 -= qtd5;
                notas1 -= qtd1;

                System.out.print("Notas entregues: \n");
                if (qtd50 > 0) System.out.printf("%d nota(s) de B$50,00\n",qtd50);
                if (qtd10 > 0) System.out.printf("%d nota(s) de B$10,00\n",qtd10);
                if (qtd5 > 0) System.out.printf("%d nota(s) de B$5,00\n",qtd5);
                if (qtd1 > 0) System.out.printf("%d nota(s) de B$1,00\n",qtd1);

                saques++;
            }else{
                System.out.print("\nNão há notas suficientes para realizar o saque");
            }

            System.out.print("Notas restantes no caixa: \n");
            System.out.printf("Nota(s) de B$50,00: %d notas\n",notas50);
            System.out.printf("Nota(s) de B$10,00: %d notas\n",notas10);
            System.out.printf("Nota(s) de B$5,00: %d notas\n",notas5);
            System.out.printf("Nota(s) de B$1,00: %d notas\n",notas1);
        }
    }
}
