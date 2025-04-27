package ifrs2;

public class ex004 {
    public static void main (String[]args){
        int idade, quant, media, soma;
        quant = 0;
        soma = 0;

        System.out.println("Digite 0 para encerrar");

        do{
            System.out.print("Digite uma idade: ");
            idade = Integer.parseInt(System.console().readLine());
            if (idade > 0){
                quant += 1;
                soma += idade;
            }
        }while (idade > 0);
        media = soma / quant;

        System.out.print("A média de idades é aproximadamente  "+media);
    }
}
