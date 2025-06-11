package ex.ifrs1;

public class ex007 {
    public static void main (String[]args){
        int opcoes=0;
        double nota1,nota2,nota3,mediaA,mediaP,p1,p2,p3;

        while(opcoes != 3){
            System.out.print("Menu de opções: ");
            System.out.println("\n1.Média Aritmética\n2.Média Ponderada\n3.Sair");
            opcoes = Integer.parseInt(System.console().readLine());
            if (opcoes == 1){
                System.out.print("Média Aritmética\n----------------\n");
                System.out.print("Nota 1: ");
                nota1 = Double.parseDouble(System.console().readLine());

                System.out.print("Nota 2: ");
                nota2 = Double.parseDouble(System.console().readLine());

                mediaA = (nota1 + nota2)/2;
                System.out.printf("A média aritmética entre %.2f e %.2f é igual a %.2f\n----------------\n", nota1,nota2,mediaA);
            }
            if (opcoes == 2){
                System.out.print("Média Ponderada\n----------------\n");

                System.out.print("Nota 1: ");
                nota1 = Double.parseDouble(System.console().readLine());
                System.out.print("Peso da nota 1: ");
                p1 = Double.parseDouble(System.console().readLine());

                System.out.print("Nota 2: ");
                nota2 = Double.parseDouble(System.console().readLine());
                System.out.print("Peso da nota 2: ");
                p2 = Double.parseDouble(System.console().readLine());

                System.out.print("Nota 3: ");
                nota3 = Double.parseDouble(System.console().readLine());
                System.out.print("Peso da nota 3: ");
                p3 = Double.parseDouble(System.console().readLine());

                mediaP = ((nota1*p1)+(nota2*p2)+(nota3*p3))/(p1+p2+p3);
                System.out.printf("A média ponderada entre %.2f, %.2f e %.2f é igual a %.2f\n----------------\n", nota1,nota2,nota3,mediaP);
            }
            if (opcoes > 3 || opcoes < 1){
                System.out.print("----------------\nInsira uma opção válida!\n----------------\n");
            }
        }
        System.out.print("Programa finalizado :D");
    }
}
