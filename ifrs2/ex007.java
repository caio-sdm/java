package ifrs2;

public class ex007 {
    public static void main (String[]args){
        int numero, quadrado, i;
        numero = 15;

        for (i = 15; i <= 200; i++){
            quadrado = numero * numero;
            System.out.printf("O quadrado de %d é igual a %d\n",numero,quadrado);
            numero++;
        }
        System.out.print("\nAcabou :D");
    }
}
