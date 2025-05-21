package alternativos;
//cardápio
public class ex8 {
    public static void main(String[]args) {
        int opcao;
        double sal, imp;

        do{
            System.out.println("\nMenu de Opções:\n\n\t1. Imposto\n\t2. Novo Salário\n\t3. Classificação\n\t4. Finalizar programa\n");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(System.console().readLine());

            System.out.print("\nInsira o salário: ");
            sal = Double.parseDouble(System.console().readLine());

            switch (opcao){
                case 1:
                    if (sal <= 1000){
                        System.out.print("O percentual de imposto é de 5%\n");
                        imp = sal - (sal * .05);
                        System.out.printf("O valor do salário após o imposto é igual a R$%.2f\n",imp);
                    }else if (sal <= 3000){
                        System.out.print("O percentual de imposto é de 10%\n");
                        imp = sal - (sal * .1);
                        System.out.printf("O valor do salário após o imposto é igual a R$%.2f\n",imp);
                    }else{
                        System.out.print("O percentual de imposto é de 15%\n");
                        imp = sal - (sal * .15);
                        System.out.printf("O valor do salário após o imposto é igual a R$%.2f\n",imp);
                    }
                    break;
                case 2:
                    if (sal <= 1350){
                        System.out.print("Aumento de R$300.00\n");
                        sal += 300;
                        System.out.printf("Salário final: R$%.2f",sal);
                    }else if (sal <= 2249.99){
                        System.out.print("Aumento de R$225.00\n");
                        sal += 225;
                        System.out.printf("Salário final: R$%.2f",sal);
                    }else if (sal <= 4500){
                        System.out.print("Aumento de R$150.00\n");
                        sal += 150;
                        System.out.printf("Salário final: R$%.2f",sal);
                    }else{
                        System.out.print("Aumento de R$45.00\n");
                        sal += 45;
                        System.out.printf("Salário final: R$%.2f",sal);
                    }
                    break;
                case 3:
                    if (sal <= 1500){
                        System.out.print("Mau remunerado\n");
                    }else{
                        System.out.print("Bem remunerado\n");
                    }
                    break;
                case 4:
                    System.out.print("--- Programa finalizado :D ---");
                default:
                    System.out.print("Insira uma opção válida!");
            }
        } while (opcao != 4);
    }
}
