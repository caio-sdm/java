package ex__ifrs2;

public class ex002 {
    public static void main (String[]args){
        int[] numeros = new int[5];
        int soma;

        for (int i = 0; i < 5; i++){
            System.out.printf("Digite o %dº número: ",i+1);
            numeros[i] = Integer.parseInt(System.console().readLine());
        }
        soma = numeros[0] + numeros[1] + numeros[2] + numeros[3] + numeros[4];
        System.out.printf("Os números digitados foram:\n%d + %d + %d + %d + %d = %d", numeros[0], numeros[1], numeros[2], numeros[3], numeros[4], soma);
    }
}

/* Constrói a expressão em formato "n1 + n2 + ..."
expressao += numeros[i];
    if (i < numeros.length - 1) {
        expressao += " + ";
    }
*/