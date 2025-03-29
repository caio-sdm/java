package ex_ifrs;

public class ex10 {
    public static void main(String[]args){
        double pes, pol, jard, mil;

        System.out.print("Informe a medida em pés:");
        pes = Double.parseDouble(System.console().readLine());
        pol = pes * 12;
        jard = pes / 3;
        mil = jard / 1760;
        System.out.printf("\n Valor em polegadas: %.2f \n",pol);
        System.out.printf("Valor em jardas: %.2f \n",jard);
        System.out.printf("Valor em milhas: %.2f",mil);
    }
}
