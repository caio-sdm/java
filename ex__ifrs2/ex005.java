package ex__ifrs2;

public class ex005 {
    public static void main (String[]args){
        int[] numeros =  new int[20];
        double[] divididos = new double[20];
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("%dº número: ", i+1);
            numeros[i] = Integer.parseInt(System.console().readLine());

            if (numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.printf("\nO maior valor é: %d",maior);
        System.out.print("\nValores após divisão pelo maior\n");
        for (int i = 0; i < numeros.length; i++){
            divididos[i] = (double) numeros[i] / maior;
            System.out.printf("\n%d dividido por %d é igual a %.2f",numeros[i],maior,divididos[i]);
        }

    }
}
