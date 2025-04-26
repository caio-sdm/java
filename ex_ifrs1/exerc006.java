package ex_ifrs1;

public class exerc006 {
    public static void main (String[]args){
        int n1,n2,n3,n4;

        System.out.print("Digite um número inteiro: ");
        n1 = Integer.parseInt(System.console().readLine());
        System.out.print("Digite outro número inteiro: ");
        n2 = Integer.parseInt(System.console().readLine());
        System.out.print("Digite outro número inteiro: ");
        n3 = Integer.parseInt(System.console().readLine());
        System.out.print("Digite outro número inteiro: ");
        n4 = Integer.parseInt(System.console().readLine());

        System.out.println("Os números divisíveis por 2 OU 3 são: ");

        if (n1 % 2 == 0 || n1 % 3 == 0){
            System.out.printf("%d\n",n1);
        }
        if (n2 % 2 == 0 || n2 % 3 == 0){
            System.out.printf("%d\n",n2);
        }
        if (n3 % 2 == 0 || n2 % 3 == 0){
            System.out.printf("%d\n",n3);
        }
        if (n4 % 2 == 0 || n3 % 3 == 0){
            System.out.printf("%d\n",n4);
        }
    }
}
