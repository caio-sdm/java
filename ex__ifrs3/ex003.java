package ex__ifrs3;

public class ex003 {
    public static void main (String[]args){
        double[][] matriz = new double[5][5];
        double soma = 0;

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                //System.out.printf("Valor da linha %d, coluna %d",i,j);
                //matriz[i][j] = Double.parseDouble(System.console().readLine());
                matriz[i][j] = Math.round((1 + Math.random()*99)*100)/100.0;

                if (i + j == 4){
                    soma += matriz[i][j];
                }
            }
        }
        double media = soma / 5;
        System.out.print("\nMatriz Resultante: \n");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                System.out.printf("%8.2f",matriz[i][j]);
            }
            System.out.println();
        }
        System.out.printf("A média dos elementos da diagonal secundária é igual a: %.2f",media);
    }
}
