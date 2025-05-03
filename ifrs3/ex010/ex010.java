package ifrs3.ex010;

public class ex010 {
    public static void main(String[]args){
        int x;
        double n1, n2, soma, quadrado;

        System.out.print("Menu de opções:\n1. Somar dois números.\n2. Número ao quadrado.\n\nDigite a opção desejada (1 ou 2): ");
        x = Integer.parseInt(System.console().readLine());

        switch (x){
            case 1:
                System.out.print("\nDigite o primeiro número: ");
                n1 = Double.parseDouble(System.console().readLine());
                System.out.print("Digite o segundo número: ");
                n2 = Double.parseDouble(System.console().readLine());

                soma = n1 + n2;

                System.out.printf("A soma de %.2f e %.2f é igual a %.2f",n1,n2,soma);
                break;
            case 2:
                System.out.print("\nDigite o número: ");
                n1 = Double.parseDouble(System.console().readLine());

                quadrado = n1*n1;

                System.out.printf("O quadrado de %.2f é igual a %.2f", n1, quadrado);
                break;
        }
    }
}
