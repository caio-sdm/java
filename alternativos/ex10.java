package alternativos;

public class ex10 {
    public static void main(String[]args){
        int[][] matriz = new int[10][20];
        int [] soma = new int[10];
        int linha, coluna;

        for (linha=0;linha<10;linha++){
            for (coluna=0;coluna<20;coluna++){
                // System.out.printf(“Informe o valor para matriz[%d][%d]”, linha, coluna);
                //matriz[linha][coluna] = Integer.parseInt(System.console().readLine());
                matriz[linha][coluna] = (int)(Math.random()*100);
            }
        }

        for (linha=0;linha<10;linha++){
            soma[linha] = 0;
            for (coluna=0;coluna<20;coluna++){
                soma[linha] += matriz[linha][coluna];
            }
        }

        for(linha=0;linha<10;linha++){
            for(coluna=0;coluna<20;coluna++){
                matriz[linha][coluna] = soma[linha] * matriz[linha][coluna];
            }
        }

        for (linha=0;linha<10;linha++){
            for (coluna=0;coluna<20;coluna++){
                System.out.printf("Matriz[%d][%d] = %d\n",linha,coluna,matriz[linha][coluna]);
            }
        }
    }
}
