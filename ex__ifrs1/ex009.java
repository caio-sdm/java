package ex__ifrs1;

public class ex009 {
    public static void main(String[]args){
        int opcoes=0, meses;
        double salario, novo=0, ferias, decimoterceiro;

        System.out.print("Menu de opções: \n1. Novo salário\n2. Férias\n3. Décimo Terceiro\n4. Sair\n==========\n");

        while (opcoes != 4){
            System.out.print("Opção: ");
            opcoes = Integer.parseInt(System.console().readLine());

            switch (opcoes){
                case 1:
                    System.out.print("Salário: ");
                    salario = Double.parseDouble(System.console().readLine());

                    System.out.print("Novo Salário\n");
                    if (salario >= 0 && salario <= 1000){
                        novo = salario + (salario * 0.15);
                    }else if (salario <= 3000){
                        novo = salario + (salario * 0.10);
                    }else if (salario > 3000){
                        novo = salario + (salario * 0.05);
                    }else{
                        System.out.print("Insira um valor válido");
                    }
                    System.out.printf("O novo salário é igual a: R$%.2f",novo);
                    System.out.print("\n==========\n");
                    break;
                case 2:
                    System.out.print("Férias\n");

                    System.out.print("Salário: ");
                    salario = Double.parseDouble(System.console().readLine());

                    ferias = salario + (salario/3);

                    System.out.printf("O valor das férias é igual a: R$%.2f",ferias);
                    System.out.print("\n==========\n");
                    break;
                case 3:
                    System.out.print("Décimo Terceiro\n");
                    System.out.print("Salário: ");
                    salario = Double.parseDouble(System.console().readLine());
                    System.out.print("Indique quantos meses foram trabalhados: ");
                    meses = Integer.parseInt(System.console().readLine());
                    if (meses < 0 || meses > 12){
                        System.out.print("Insira um mês válido!");
                    }else{
                        decimoterceiro = (salario * meses) / 12;

                        System.out.printf("O valor do décimo terceiro é igual a: R$%.2f", decimoterceiro);
                        System.out.print("\n==========\n");
                    }
                    break;
                case 4:
                    System.out.print("Programa finalizado :D");
                    break;
                default:
                    System.out.print("Insira uma opção válido!");
            }
        }
    }
}
