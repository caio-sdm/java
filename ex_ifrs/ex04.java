package ex_ifrs;
//Valor de um produto depois de 10% de desconto
public class ex04 {
    public static void main(String[]args){
        double n1, res;

        System.out.print("Informe o preço do produto: ");
        n1 = Double.parseDouble(System.console().readLine());

        res = n1 - n1*10/100;
        System.out.printf("O preço do produto, após um desconto de 10%%, é igual a R$ %.2f",res);
    }
}
