package ex_ifrs;
//Calculo de salário após aumento de 5% e desconto de 7%
public class ex05 {
    public static void main(String[]args){
        double s1, s2, res;
        System.out.print("Informe o valor do seu salário: ");
        s1 = Double.parseDouble(System.console().readLine());
        s2 = s1 + s1*5/100;

        res = s2 - s2*7/100;
        System.out.printf("Seu salário final será de R$ %.2f",res);
    }
}
