package ifrs2;

public class ex003 {
    public static void main(String[]args){
        int num, quad;

        System.out.println("Para parar, digite um número negativo");

        do{
            System.out.print("Digite um número: ");
            num = Integer.parseInt(System.console().readLine());
            if (num >=0){
                quad = num * num;
                System.out.printf("O quadrado de %d é igual a %d\n\n",num,quad);
            }
        } while (num >= 0);

        System.out.print("Processo encerrado");
    }
}
