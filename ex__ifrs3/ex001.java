package ex__ifrs3;

public class ex001 {
    public static void main (String[]args){
        int[][] numeros = new int[6][4];
        int[] maiores = new int[6];

        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 4; j++){
                System.out.printf("Valor da linha %d, coluna %d: ",i+1,j+1);
                numeros[i][j] = Integer.parseInt(System.console().readLine());
            }
        }
        for (int i = 0; i < 6; i++){
            int maior = numeros[i][0];
            for (int j = 0; j < 4; j++) {
                if (numeros[i][j] > maior) {
                    maior = numeros[i][j];
                }
            }
            maiores[i] = maior;
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                numeros[i][j] *= maiores[i];
            }
        }
        System.out.println("\nMatriz resultante");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("%6d",numeros[i][j]);
            }
            System.out.println();
        }
    }
}
