package ifrs4;

public class ex004 {
    public static void main(String[]args){
        double a,b,c,delta,eq1,eq2;

        System.out.print("Digite o valor de a (que acompanha o x^2): ");
        a = Double.parseDouble(System.console().readLine());
        System.out.print("Digite o valor de b (que acompanha o x): ");
        b = Double.parseDouble(System.console().readLine());
        System.out.print("Digite o valor de c (que não acompanha variável): ");
        c = Double.parseDouble(System.console().readLine());

        delta = Math.sqrt((b*b)-4*a*c);

        if (delta > 1){
            eq1 = (-b + delta)/2;
            eq2 = (-b - delta)/2;

            System.out.printf("\nAs raízes da equação são %.2f e %.2f\nS={%.2f,%.2f}",eq1,eq2,eq1,eq2);

        } else if(delta == 0){
            eq1 = (-b + delta)/2;

            System.out.printf("A raíz da equação é %.2f\nS={%.2f}",eq1,eq1);

        } else{
            System.out.print("A equação não tem raízes Reais. Resolvendo em Imaginário (C)...");

            delta = Math.sqrt(Math.abs((b*b)-4*a*c));
            eq1 = (-b/2);

            System.out.printf("As raízes da equação são %.2f +/- %.0fi",eq1,delta);
        }
    }
}
