package ex_ifrs1;

public class exerc009 {
    public static void main(String[]args){
        double sal;

        System.out.print("Informe seu salário: ");
        sal = Double.parseDouble(System.console().readLine());

        if (sal < 5000){
            sal = sal + (sal * 30/100);
            System.out.print("Seu novo salário é R$"+sal);
        } else {
            System.out.print("Você não terá aumento de salário hahaha");
        }
    }
}
