package ex__ifrs3;

public class ex004 {
    public static void main (String[]args){
        char[][] matriz = new char[10][10];
        char[] gabarito = new char[10];
        int[] pontuacao= new int[10];

        System.out.print("Gabarito da prova: ");
        for (int i = 0; i < 10; i++){
            //System.out.printf("Questão %d",i+1);
            //gabarito[i] = System.console().readLine().charAt(0);
            gabarito[i] = (char) ((Math.random()*5) + 'A');
            System.out.printf("%2c",gabarito[i]);
        }

        System.out.print("\nResposta dos candidatos:");
        for (int i = 0; i < matriz.length; i++){
            System.out.printf("Candidato %d",i+1);
            for (int j = 0; j < matriz.length; j++){
                //System.out.printf("\nQuestão %d",j+1);
                //matriz[i][j] = System.console().readLine().charAt(0);
                matriz[i][j] = (char) ((Math.random()*5) + 'A');
            }
        }

        for (int i = 0; i < 10; i++){
            int pontos = 0;
            for (int j = 0; j < 10; j++){
                if (matriz[i][j] == gabarito[j]){
                    pontos++;
                }
            }
            pontuacao[i] = pontos;
        }

        System.out.print("\nMatriz resultante: \n");
        System.out.print("                   ");
        for (int j = 0; j < 10; j++){
            System.out.printf("Q%02d     ",j+1);
        }
        System.out.println();

        for (int i = 0; i < 10; i++){
            System.out.printf("candidato %02d",i+1);
            for (int j = 0; j < 10; j++){
                System.out.printf("%8c",matriz[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nPontuação dos candidatos:");
        for (int i = 0; i < 10; i++){
            System.out.printf("\nCandidato %d: %d acerto(s)", i+1, pontuacao[i]);
        }
    }
}
