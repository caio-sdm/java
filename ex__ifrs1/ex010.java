package ex__ifrs1;

public class ex010 {
    public static void main (String[]args){
        int numero;
        boolean primo;
        char continuar;

        System.out.print("Inserir número? (S/N)");
        continuar = System.console().readLine().charAt(0);

        while (continuar == 's' || continuar == 'S') {
            primo = true;
            System.out.print("Digite um número maior que 1: ");
            numero = Integer.parseInt(System.console().readLine());
            if (numero <= 1) {
                System.out.print("Digite um número maior que 1!");
                break;
            } else {
                for (int i = 2; i < numero; i++) {
                    if (numero % i == 0) {
                        primo = false;
                        break;
                    }
                }

                if (primo) {
                    System.out.printf("%d é primo", numero);
                } else {
                    System.out.printf("%d não é primo", numero);
                }
            }
            System.out.print("\nInserir outro número? (S/N)");
            continuar = System.console().readLine().charAt(0);
        }
        System.out.print("\n------------------\nPrograma Finalizado :D");
    }
}
