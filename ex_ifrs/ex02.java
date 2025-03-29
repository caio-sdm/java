public class ex02 {
    public static void main(String[]args){
        double n1, n2, div;

        System.out.print("Escreva o primeiro número: ");
        n1 = Double.parseDouble(System.console().readLine());
        System.out.print("Escreva o segundo número: ");
        n2 = Double.parseDouble(System.console().readLine());

        div = n1/n2;
        System.out.printf("A divisão de %.2f por %.2f é igual a %.2f", n1, n2, div);
    }
}
