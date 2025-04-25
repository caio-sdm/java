package ex_ifrs1;

public class exerc003 {
    public static void main(String[]args){
        double A,B,C,delta,x1,x2;

        System.out.print("Digite o primeiro termo da equação (que acompanha o x²): ");
        A = Double.parseDouble(System.console().readLine());
        System.out.print("Digite o segundo termo da equação (que acompanha o x): ");
        B = Double.parseDouble(System.console().readLine());
        System.out.print("Digite o terceiro termo da equação (que não acompanha variável): ");
        C = Double.parseDouble(System.console().readLine());

        delta = Math.sqrt(Math.pow(B, 2) - 4*A*C);
        if (delta < 0){
            System.out.print("A equação não tem raízes reais :(");
        } else if (delta == 0) {
            x1 = (-B + delta)/2;
            System.out.printf("A raíz da equação é: S={%.2f}",x1);
        } else if (delta > 0){
            x1 = (-B + delta)/2;
            x2 = (-B - delta)/2;
            System.out.printf("As raízes da equação são: S={%.2f,%.2f}",x1,x2);
        }
    }
}
