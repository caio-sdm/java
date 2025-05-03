package ifrs3.ex005;

public class ex005 {
    public static void main (String[]args){
        double litro, dist, consumo, somaconsumo, media;
        int viagens, i;

        somaconsumo = 0;

        System.out.println("Para encerrar, digite 0 \n");

        System.out.print("Quantas viagens foram feitas? ");
        viagens = Integer.parseInt(System.console().readLine());

        if (viagens == 0){
            System.out.print("\nNão foram feitas viagens :D");
        }

        if (viagens > 0){
            for (i = 1; i <= viagens; i++){
                System.out.printf("\nInforme quantos litros gastos na viagem %d: ",i);
                litro = Double.parseDouble(System.console().readLine());

                System.out.printf("Informe quantos quilômetros rodados na viagem %d: ",i);
                dist = Double.parseDouble(System.console().readLine());

                consumo = dist/litro;
                somaconsumo += consumo;
            }
        }

        media = somaconsumo / viagens;
        System.out.printf("\nO consumo médio foi: %.2f litros",media);
    }
}
