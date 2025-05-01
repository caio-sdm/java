package ifrs3.ex003;

public class ex003 {
    public static void main(String[]args){
        int n, soma, i;
        soma = 0;

        for (i = 0; i < 10; i++){
            System.out.print("Forneça um número: ");
            n = Integer.parseInt(System.console().readLine());

            soma += n;
        }
        System.out.printf("\n\nA soma dos números é igual a: %d",soma);
    }
}
