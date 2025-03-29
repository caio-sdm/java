package ex_ifrs;

public class ex12 {
    public static void main(String[]args){
        double pfab, pluc, imps, custo, vluc, vimp;

        System.out.print("Informe o preço de fábrica: ");
        pfab = Double.parseDouble(System.console().readLine());
        System.out.print("Informe o percentual de lucro do distribuidor: ");
        pluc = Double.parseDouble(System.console().readLine());
        System.out.print("Informe o percentual de impostos: ");
        imps = Double.parseDouble(System.console().readLine());

        vluc = pfab * pluc/100;
        vimp = pfab * imps/100;
        custo = pfab + vluc + vimp;
        System.out.printf("O custo do carro é igual a: R$ %.2f",custo);
    }
}
