package ex__ifrs2;

public class ex003 {
    public static void main (String[]args){
        String[] nome = new String[8];
        int[] quantidade = new int[8];
        int[] gratis = new int[8];

        for (int i = 0; i < 8; i++){
            System.out.print("\nNome do cliente: ");
            nome[i] = System.console().readLine();
            System.out.print("Quantidade de DVDs locados: ");
            quantidade[i] = Integer.parseInt(System.console().readLine());

            gratis[i] = quantidade[i] / 10;
        }
        System.out.print("\nClientes com diretio a locações grátis:");
        for (int i =0; i < 8; i++){
            System.out.printf("\nO cliente %s tem direito a %d locação(ões) grátis",nome[i], gratis[i]);
        }
    }
}
