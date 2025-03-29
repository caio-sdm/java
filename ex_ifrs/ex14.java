package ex_ifrs;

public class ex14 {
    public static void main(String[]args){
        double salm, qwc, vqw, total, desc;

        System.out.print("Informe o valor do salário mínimo: ");
        salm = Double.parseDouble(System.console().readLine());
        System.out.print("Informe a quantidade de Quilowatts consumida: ");
        qwc = Double.parseDouble(System.console().readLine());
        vqw = salm / 5;
        total = vqw * qwc;
        desc = total - (total*15/100);
        System.out.printf("\nValor de cada quilowatt: %.2f\n", vqw);
        System.out.printf("Valor a ser pago: %.2f\n", total);
        System.out.printf("Valor a ser pago com 15%% de desconto: %.2f", desc);
    }
}
