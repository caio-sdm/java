
//Cálculo de média de 3 notas
public class ex03 {
    public static void main(String[]args){
        double n1, n2, n3, res;

        System.out.print("Escreva a primeira nota: ");
        n1 = Double.parseDouble(System.console().readLine());
        System.out.print("Escreva a segunda nota: ");
        n2 = Double.parseDouble(System.console().readLine());
        System.out.print("Escreva a terceira nota: ");
        n3 = Double.parseDouble(System.console().readLine());

        res = (n1 + n2 + n3)/3;
        System.out.printf("Sua média é igual a %.2f", res);
    }
}
