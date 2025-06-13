package ex__ifrs1;

public class ex008 {
    public static void main(String[]args){
        int voto, cand1=0, cand2=0, cand3=0, cand4=0, nulo=0, branco=0, votos=0;
        double brancos, nulos;

        System.out.print("1-Humberto\n2-Doisberto\n3-Tresberto\n4-Quatroberto\n5-Nulo\n6-Branco");

        do{
            System.out.printf("\n=========\nVoto %d\n",votos+1);

            System.out.print("Seu voto: ");
            voto = Integer.parseInt(System.console().readLine());
            switch (voto){
                case 1:
                    cand1++;
                    votos++;
                    break;
                case 2:
                    cand2++;
                    votos++;
                    break;
                case 3:
                    cand3++;
                    votos++;
                    break;
                case 4:
                    cand4++;
                    votos++;
                    break;
                case 5:
                    nulo++;
                    votos++;
                    break;
                case 6:
                    branco++;
                    votos++;
                    break;
                case 0:
                    System.out.print("\n==========\nPrograma finalizado :D\n==========\n");
                    break;
                default:
                    System.out.print("Insira um valor válido!");
            }
        } while (voto != 0);
        brancos = (double) (100*branco)/votos;
        nulos = (double) (100*nulo)/votos;

        System.out.printf("Votos para o candidato 1: %d\n",cand1);
        System.out.printf("Votos para o candidato 2: %d\n",cand2);
        System.out.printf("Votos para o candidato 3: %d\n",cand3);
        System.out.printf("Votos para o candidato 4: %d\n",cand4);
        System.out.printf("Votos nulos: %d\n",nulo);
        System.out.printf("Votos em branco: %d",branco);
        System.out.print("\n==========\n");
        System.out.printf("Porcentagem de votos nulos: %.2f%%\n",nulos);
        System.out.printf("Porcentagem de votos em branco: %.2f%%",brancos);
    }
}
