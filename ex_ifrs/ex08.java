package ex_ifrs;

public class ex08 {
    public static void main(String[]args){
        double base, alt, area;

        System.out.println("Calcular a área de um triângulo");

        System.out.print("Indique a base do triângulo: ");
        base = Double.parseDouble(System.console().readLine());
        System.out.print("Indique a altura do triângulo: ");
        alt = Double.parseDouble(System.console().readLine());

        area = (base * alt)/2;
        System.out.printf("A área do triângulo é igual a %.2f",area);
    }
}
