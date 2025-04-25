package ex_ifrs1;

public class exerc002 {
    public static void main(String[]args){
        int num;

        System.out.print("Escreva um número: ");
        num = Integer.parseInt(System.console().readLine());

        if (0<=num && num<=10) {
            System.out.print("O número está DENTRO da faixa permitida (0-10)");
        } else {
            System.out.print("O número esta FORA da faixa permitida (0-10)");
        }
    }
}
