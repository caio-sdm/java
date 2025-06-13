package ex__ifrs2;

public class ex001 {
    public static void main (String[]args){
        String[] nome = new String[10];
        int[] codigo = new int[10];
        double[] preco = new double[10];
        double[] novopreco = new double[10];

        for (int i = 0; i < 10; i++){
            System.out.print("Nome do produto: ");
            nome[i] = System.console().readLine();
            System.out.print("Código do produto: ");
            codigo[i] = Integer.parseInt(System.console().readLine());
            System.out.print("Preço do produto: ");
            preco[i] = Double.parseDouble(System.console().readLine());

            if (codigo[i] % 2 == 0 && preco[i] > 1000){
                novopreco[i] = preco[i] + (preco[i]*0.2);
            }else if (codigo[i] % 2 == 0){
                novopreco[i] = preco[i] + (preco[i]*0.15);
            }else if (preco[i] > 1000) {
                novopreco[i] = preco[i] + (preco[i] * 0.1);
            }else{
                novopreco[i] = preco[i];
            }
        }

        System.out.print("Produtos que tiveram aumento: \n");
        for (int i =0; i < 10; i++){
            if (novopreco[i] != preco[i]) {
                System.out.printf("%s (código %d): de R$%.2f para R$%.2f\n", nome[i], codigo[i], preco[i], novopreco[i]);
            }
        }
    }
}
