package ex_ifrs;

public class ex13 {
    public static void main(String[]args){
        double smin, hrt, vhrt, sbrut, imp, sal;

        System.out.print("Informe suas horas trabalhadas: ");
        hrt = Double.parseDouble(System.console().readLine());
        System.out.print("Informe o valor do salário mínimo: ");
        smin = Double.parseDouble(System.console().readLine());

        vhrt = smin / 10;
        sbrut = vhrt * hrt;
        imp = sbrut * 3/100;
        sal = sbrut - imp;

        System.out.printf("Seu salário é de R$ %.2f",sal);
    }
}
