package ex.ifrs1;
/*ler idade sexo e salario;
mostrar media de salario, maior e menor idade, mulheres com ate 1500, idade e sexo com menor salario.
terminar ao idade negativa*/

public class ex001 {
    public static void main (String[]args){
        double sal, menorsal = Double.MAX_VALUE, somasal=0;
        int idade, cont=1, mulheres=0, maior=Integer.MIN_VALUE, menor=Integer.MAX_VALUE, idademenorsal=0;
        char sexo, sexomenorsal = ' ';

        System.out.printf("Pessoa %d",cont);
        System.out.print("\nIdade: ");
        idade = Integer.parseInt(System.console().readLine());

        while (idade >= 0) {
            System.out.print("Sexo (M/F): ");
            sexo = System.console().readLine().charAt(0);

            System.out.print("Salário: ");
            sal = Double.parseDouble(System.console().readLine());

            somasal += sal;

            if (idade > maior){
                maior = idade;
            }
            if (idade < menor){
                menor = idade;
            }

            if ((sexo == 'F' || sexo == 'f') && sal <=1500){
                mulheres++;
            }

            if (sal < menorsal){
                menorsal = sal;
                idademenorsal = idade;
                sexomenorsal = sexo;
            }
            cont++;

            System.out.printf("\nPessoa %d", cont);
            System.out.print("\nIdade: ");
            idade = Integer.parseInt(System.console().readLine());

        }
        double media = somasal / (cont-1);

        System.out.printf("Média: R$%.2f\n",media);
        System.out.printf("Maior idade: %d\nMenor idade: %d\n",maior,menor);
        System.out.printf("Mulheres com sal até 1500: %d\n", mulheres);
        System.out.printf("idade e sexo da pessoa com menor sal: %d, %c\n", idademenorsal, sexomenorsal);

    }
}
