package ifrs4;

public class ex005 {
    public static void main (String[]args){
        double n, fator, nfinal;
        int casas;

        System.out.print("Escreva um número: ");
        n = Double.parseDouble(System.console().readLine());
        System.out.print("Escreva quantas casas decimais o número sera arredondado (para cima): ");
        casas = Integer.parseInt(System.console().readLine());

        fator = Math.pow(10, casas);
        nfinal = Math.round(n * fator)/fator;

        System.out.printf("Número original: %f\nNúmero arredondado: %f",n,nfinal);
    }
}
