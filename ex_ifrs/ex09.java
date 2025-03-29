package ex_ifrs;

public class ex09 {
    public static void main(String[]args){
        double lado, area;

        System.out.print("Indique a medida do lado do quadrado: ");
        lado = Double.parseDouble(System.console().readLine());

        area = Math.pow(lado, 2);
        System.out.printf("A área do quadrado é igual a %.2f",area);
    }
}
