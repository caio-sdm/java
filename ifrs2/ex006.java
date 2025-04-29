package ifrs2;

public class ex006 {
    public static void main(String[]args){
        double faturamento,precouni, precototal;
        int mercadorias, quantuni, i;
        String nome;

        faturamento = 0;

        System.out.print("Quantas mercadorias são comercializadas? : ");
        mercadorias = Integer.parseInt(System.console().readLine());

        for (i = 1; i <= mercadorias; i++){
            System.out.printf("\nNome da mercadoria %d: ", i);
            nome = System.console().readLine();

            System.out.print("Preço da mercadoria: ");
            precouni = Double.parseDouble(System.console().readLine());

            System.out.print("Quantas foram compradas: ");
            quantuni = Integer.parseInt(System.console().readLine());

            precototal = precouni * quantuni;
            faturamento += precototal;
        }

        System.out.printf("\nO faturamento total foi de %.2f R$",faturamento);
    }
}
