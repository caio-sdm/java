package ex.ifrs1;
//letra da ação, preço de compra e venda. superiores a 1000 e inferiores a 200

public class ex002 {
    public static void main (String[]args){
        char acao;
        double valorcompra, valorvenda;
        int cont=1,lucro1000=0,lucro200=0;

        do{
            System.out.printf("Ação %d\n-----------------\n",cont);
            System.out.print("Tipo: ");
            acao = System.console().readLine().charAt(0);
            if (acao =='F'){
                break;
            }
            System.out.print("Valor de compra: R$");
            valorcompra = Double.parseDouble(System.console().readLine());
            System.out.print("Valor de venda: R$");
            valorvenda = Double.parseDouble(System.console().readLine());

            if (valorvenda - valorcompra > 1000){
                lucro1000++;
            }
            if (valorvenda - valorcompra < 200){
                lucro200++;
            }

            cont++;
        }while (acao != 'F');
        System.out.printf("Ações com lucro superior a R$1000.00: %d\nAções com lucro inferior a R$200.00: %d\n",lucro1000,lucro200);
    }
}
