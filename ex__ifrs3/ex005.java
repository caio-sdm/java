package ex__ifrs3;

public class ex005 {
    public static void main (String[]args){
        int[][] notas = new int[15][5];
        String[] nomes = new String[15];
        int[] soma = new int[15];
        double[] media = new double[15];

        for (int i = 0; i < 15; i++){
            System.out.print("\nNome do aluno: ");
            nomes[i] = System.console().readLine();
            for (int j = 0; j < 5; j++){
                //System.out.printf("Nota da prova %d do aluno %s: ",j+1,nomes[i]);
                //notas[i][j] = Integer.parseInt(System.console().readLine());
                notas[i][j] = (int)(1 + Math.random()*10);
                System.out.print(notas[i][j] + " , ");
                soma[i] += notas[i][j];
            }
        }
        for (int i = 0; i < 15; i++){
            media[i] = (double)soma[i]/5;
            if (media[i]<2 && media[i]>=0){
                System.out.printf("Média do aluno %s: %.2f\nSituação: Reprovado!\n",nomes[i], media[i]);
            }else if (media[i]>=2 && media[i]<7){
                System.out.printf("Média do aluno %s: %.2f\nSituação: Recuperação/Exame!\n",nomes[i], media[i]);
            } else if (media[i] >= 7 && media[i]<=10) {
                System.out.printf("Média do aluno %s: %.2f\nSituação: Aprovado!\n",nomes[i], media[i]);
            }
        }

        System.out.print("======== Boletim Final ========\n");
        for (int i = 0; i < 15; i++){
            System.out.printf("%-15s | Média: %.2f\n",nomes[i], media[i]);
        }
    }
}
