package ifrs2;

public class ex001 {
    public static void main (String[]args){
        double numeros, n, soma;
        numeros = 0;
        soma = 0;

        while (numeros < 10){
            System.out.print("Forneca um número: ");
            n = Double.parseDouble(System.console().readLine());
            soma += n;
            numeros += 1;
        }
        System.out.print("A soma dos números é: " + soma);
    }
}
