package ex.ifrs1;
/*sexo,cor olhos, cor cabelo, idade, altura, peso;
média da idade, media de peso e altura, porcentagem feminino, porcentagem masculino, olhos azuis *E* cabelos ruivos*/
public class ex005 {
    public static void main(String[]args){
        char sexo, corcabelo, continuar;
        int corolhos, idade=0, somaidades=0, azulruivo=0, pessoas=1, homens=0, mulheres=0;
        double altura, peso, mediaidade, mediapeso, somapeso=0, medialtura, somaltura=0, porcentmasc, porcentfem;

        System.out.println("Começar cadastros? (S/N)\n");
        continuar = System.console().readLine().charAt(0);
        System.out.print("Cor dos olhos: \n1-Azuis \n2-Verdes \n3-Castanhos\n");
        System.out.print("Cor dos cabelos: \nL-Loiros \nR-Ruivos \nC-Castanhos \nP-Pretos");

        while (continuar == 'S' || continuar == 's'){
            System.out.printf("Pessoa %d",pessoas);
            System.out.print("===========");

            System.out.print("Sexo (M/F): ");
            sexo = System.console().readLine().charAt(0);
            if (sexo == 'F' || sexo == 'f'){
                mulheres++;
            }
            if (sexo == 'M' || sexo =='m'){
                homens++;
            }

            System.out.print("Cor dos olhos: ");
            corolhos = Integer.parseInt(System.console().readLine());

            System.out.print("Cor dos cabelos: ");
            corcabelo = System.console().readLine().charAt(0);

            if ((corcabelo == 'R' || corcabelo == 'r') && corolhos == 1){
                azulruivo++;
            }

            System.out.print("Idade: ");
            idade = Integer.parseInt(System.console().readLine());
            somaidades += idade;

            System.out.print("Altura: ");
            altura = Double.parseDouble(System.console().readLine());
            somaltura += altura;

            System.out.print("Peso; ");
            peso = Double.parseDouble(System.console().readLine());
            somapeso += peso;



            pessoas++;
            System.out.println("Cadastrar outra pessoa? (S/N)");
            continuar = System.console().readLine().charAt(0);
        }
    }
}
