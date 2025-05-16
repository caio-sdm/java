package alternativos;
//cinema 1
public class ex6 {
    public static void main(String[]args){
        int idade, idadepessimo=0, espect = 0, idaderuim=0;
        int otimo = 0, ruim = 0, pessimo = 0;
        char nota;
        double mediaruim, porcentpessimo;

        for (int i = 1; i<=100; i++){
            System.out.printf("---Espectador %03d---\n",i);
            System.out.print("Idade: ");
            idade = Integer.parseInt(System.console().readLine());

            System.out.print("Nota: ");
            nota = System.console().readLine().charAt(0);

            if (nota == 'A' || nota == 'a'){
                otimo++;
            } else if (nota == 'D'||nota=='d'){
                ruim++;
                idaderuim+=idade;
            } else if (nota == 'e'||nota == 'E'){
                pessimo++;
                if (idadepessimo < idade){
                    idadepessimo = idade;
                }
            }
            espect++;
        }
        porcentpessimo= (((double)pessimo*100)/espect);
        mediaruim = (double) idaderuim/ruim;

        System.out.printf("Quantidade de ótimos: %d\n", otimo);
        System.out.printf("Porcentagem de pessimos: %.2f%%\n", porcentpessimo);
        System.out.printf("Media de ruins: %.2f\n", mediaruim);
        System.out.printf("maior idade pessimo: %d\n",idadepessimo);
    }
}
