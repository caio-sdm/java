package ex_ifrs1;

public class exerc008 {
    public static void main(String[]args){
        int n1,n2,n3;

        System.out.print("Digite um número inteiro: ");
        n1 = Integer.parseInt(System.console().readLine());
        System.out.print("Digite outro número inteiro: ");
        n2 = Integer.parseInt(System.console().readLine());
        System.out.print("Digite outro número inteiro: ");
        n3 = Integer.parseInt(System.console().readLine());

        System.out.println("O maior valor informado é: ");

        if (n1 < n2 && n1 < n3) {
            System.out.print(n1);
        }

        if (n2 < n1 && n2 < n3) {
            System.out.print(n2);
        }

        if (n3 < n1 && n3 < n2) {
            System.out.print(n3);
        }
    }
}