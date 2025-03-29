package ex_ifrs;
//salário + comissão de vendas (4% do valor das vendas)
public class ex06 {
    public static void main(String[]args){
        double s1, v1, res;

        System.out.print("Informe seu salário: ");
        s1 = Double.parseDouble(System.console().readLine());
        System.out.print("Informe o valor de suas vendas: ");
        v1 = Double.parseDouble(System.console().readLine());

        res = s1 + v1*4/100;
        System.out.printf("Seu salário é: R$ %.2f",res);
    }
}
