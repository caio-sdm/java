package ex__ifrs4;

public class ex004 {
    public static void negativos(int[] vetor){
        for (int i = 0; i < 25; i++){
            if (vetor[i] < 0){
                vetor[i] = 0;
            }
        }
    }
    public static void main (String[]args){
        int[] a = new int[25];

        System.out.print("Digite 25 números inteiros: \n");
        for (int i = 0; i < a.length; i++){
            System.out.printf("A[%d]: ",i+1);
            a[i] = Integer.parseInt(System.console().readLine());
        }

        negativos(a);

        System.out.print("Vetor após substituição de negativos por 0: \n");
        for (int i = 0; i < 25; i++){
            System.out.printf("A[%d] = %d\n",i,a[i]);
        }
    }
}
