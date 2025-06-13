package ex__ifrs2;

public class ex004 {
    public static void main (String[]args){
        int[] a = new int[5], b = new int[5], soma = new int[5];

        System.out.print("Soma do primeiro com o último, segundo com o penúltimo...\n");

        for (int i = 0; i < 5; i++){
            System.out.printf("Escreva o %dº número do Conjunto A: ",i+1);
            a[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.print("\n");
        for (int i = 0; i < 5; i++){
            System.out.printf("Escreva o %dº número do Conjunto B: ",i+1);
            b[i] = Integer.parseInt(System.console().readLine());
        }
        System.out.print("\nSomas: \n");
        for (int i = 0; i < 5; i++){
            soma[i] = a[i] + b[b.length - 1 - i];
            System.out.printf("Soma %d: %d + %d = %d\n", i+1, a[i], b[b.length - 1 - i], soma[i]);
        }
    }
}
