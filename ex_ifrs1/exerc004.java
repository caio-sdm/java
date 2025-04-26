package ex_ifrs1;

public class exerc004 {
    public static void main (String[]args){
        double A,B,C,tri;

        System.out.print("Digite o primeiro lado do triângulo: ");
        A = Double.parseDouble(System.console().readLine());
        System.out.print("Digite o segundo lado do triângulo: ");
        B = Double.parseDouble(System.console().readLine());
        System.out.print("Digite o terceiro do triângulo: ");
        C = Double.parseDouble(System.console().readLine());

        if (A+B > C || A+C >B || B+C > A){
            System.out.print("É um triângulo :D");
        } else {
            System.out.print("Não é um triângulo D:");
        }
    }
}
