package alternativos;

public class ex3 {
    public static void main(String[]args){
        double n1,n2;

        System.out.print("Escreva o primeiro número: ");
        n1 = Double.parseDouble(System.console().readLine());
        System.out.print("Escreva o segundo número: ");
        n2 = Double.parseDouble(System.console().readLine());

        if (n1>n2){
            System.out.printf("%.2f é maior que %.2f",n1,n2);
        } else if (n2>n1){
            System.out.printf("%.2f é maior que %.2f",n2,n1);
        } else {
            System.out.print("Os números são iguais");
        }
    }
}
