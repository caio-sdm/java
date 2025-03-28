public class ex001 {
    public static void main (String[] args){
        double N1, N2, N3, N4, RES;
        System.out.print("Digite sua primeira nota: ");
        N1 = Double.parseDouble(System.console().readLine());
        System.out.print("Digite sua segunda nota: ");
        N2 = Double.parseDouble(System.console().readLine());
        System.out.print("Digite sua terceira nota: ");
        N3 = Double.parseDouble(System.console().readLine());
        System.out.print("Digite sua quarta nota: ");
        N4 = Double.parseDouble(System.console().readLine());

        RES = (N1+N2+N3+N4)/4;
        System.out.printf("Sua média é: %.1f\n", RES);
    }
}