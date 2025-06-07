import java.util.Arrays;

public class forca {
    static char[] sorteiaPalavra(){
        int sorteio = (int)(Math.random()*10)+1;

        switch (sorteio){
            case 1: return new char[]{'U','V','A'};
            case 2: return new char[]{'M','A','N','G','A'};
        }
        return new char[0];
    }
    static char[] montaTabuleiro(char[] palavra){
        char[] tabuleiro = new char[palavra.length];
        for (int cont = 0; cont < tabuleiro.length; cont++){
            tabuleiro[cont] = '_';
        }
        return tabuleiro;
    }
    static void mostraTabuleiro(char[]tabuleiro){
        for (int cont = 0; cont < tabuleiro.length; cont++){
            System.out.print(tabuleiro[cont] + " ");
        }
        System.out.println();
    }
    static boolean acertou(char[] palavra, char letra){
        for (int cont = 0; cont < palavra.length;cont++){
            if (palavra[cont]==letra){
                return true;
            }
        }
        return false;
    }
    static void atualizaTabuleiro(char[]tabuleiro, char[]palavra, char letra){
        for (int cont = 0; cont < palavra.length; cont++){
            if (palavra[cont] == letra){
                tabuleiro[cont] = letra;
            }
        }
    }

    //aqui começa o código :D

    public static void main(String[]args){
        char[] palavra = sorteiaPalavra();
        char[] tabuleiro = montaTabuleiro(palavra);
        int erros = 0;
        while (erros <=7 && !Arrays.equals(tabuleiro,palavra)){
            mostraTabuleiro(tabuleiro);

            System.out.print("Informe uma letra:");
            char letra = System.console().readLine().charAt(0);

            if(acertou(palavra,letra)){
                atualizaTabuleiro(tabuleiro,palavra,letra);
            }else{
                erros++;
            }
        }
        if (erros>7){
            System.out.print("Perdeu... :/");
        }else{
            System.out.print("Ganhou! :D");
        }
    }
}
