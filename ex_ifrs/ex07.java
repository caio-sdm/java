package ex_ifrs;
//média, mas com pesos diferentes em cada nota
public class ex07 {
    public static void main(String[]args){
        double n1, n2, n3, p1, p2, p3, soma, med;

        System.out.print("Escreva sua primeira nota: ");
        n1 = Double.parseDouble(System.console().readLine());
        System.out.print("Escreva o peso dessa nota: ");
        p1 =Double.parseDouble(System.console().readLine());

        System.out.print("Escreva sua segunda nota: ");
        n2 = Double.parseDouble(System.console().readLine());
        System.out.print("Escreva o peso dessa bota: ");
        p2 = Double.parseDouble(System.console().readLine());

        System.out.print("Escreva sua terceira nota: ");
        n3 = Double.parseDouble(System.console().readLine());
        System.out.print("Escreva o peso dessa nota: ");
        p3 = Double.parseDouble(System.console().readLine());

        soma = n1*p1 + n2*p2 + n3*p3;
        med = soma/(p1+p2+p3);
        System.out.printf("Sua média é %.2f", med);
    }
}
