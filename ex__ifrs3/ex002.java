package ex__ifrs3;

public class ex002 {
    public static void main (String[]args){
        int[][] matriz = new int[10][10];
        int soma = 0;

        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.printf("Valor da linha %d, coluna %d: ",i+1,j+1);
                matriz[i][j] = Integer.parseInt(System.console().readLine());
                //matriz[i][j] = (int) (1 + Math.random()*100);

                if (i == j) {
                    soma += matriz[i][j];
                }
            }
        }
        double media = soma / 10.0;
        System.out.print("\nMatriz completa: \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%5d",matriz[i][j]);
            }
            System.out.println();
        }
        System.out.printf("A média dos elementos da diagonal principal é igual a: %.2f",media);
    }
}
