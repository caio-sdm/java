package ifrs2;

public class ex007 {
    public static void main (String[]args){
        double numero, quadrado, i;
        numero = 15;

        for (i = 15; i <= 200; i++){
            quadrado = Math.pow(numero,2);
            System.out.printf("O quadrado de %.1f é igual a %.1f\n",numero,quadrado);
            numero++;
        }
        System.out.print("\nAcabou :D");
    }
}
