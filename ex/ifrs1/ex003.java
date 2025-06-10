package ex.ifrs1;
//numero de sexo candidatos, idade media homens, idade media mulheres com exp.
public class ex003 {
    public static void main(String[]args){
        char sexo, continuar;
        int cont=1, exp, idade, idadeh=0, homens=0, mediah = 0, mulheres=0, quantexp=0, idademulheresexp=0, mediamexp=0;

        System.out.println("Cadastrar candidato? (S/N)");
        continuar = System.console().readLine().charAt(0);
        if (continuar == 'S' || continuar == 's') {
            do {
                System.out.printf("Pessoa %d\n", cont);
                System.out.println("-----------");
                System.out.print("Sexo (M/F): ");
                sexo = System.console().readLine().charAt(0);

                System.out.print("Idade: ");
                idade = Integer.parseInt(System.console().readLine());

                System.out.print("Experiência profissional (anos): ");
                exp = Integer.parseInt(System.console().readLine());

                if (sexo == 'M'|| sexo == 'm'){
                    homens++;
                    idadeh += idade;
                } else if (sexo == 'F'|| sexo =='f') {
                    mulheres++;
                    if (exp > 0) {
                        idademulheresexp += idade;
                        quantexp++;
                    }
                }

                cont++;

                System.out.println("\nCadastrar outro candidato? (S/N)");
                continuar = System.console().readLine().charAt(0);

            } while (continuar == 's' || continuar == 'S');
        } else {
            System.out.print("Programa finalizado :D");
        }
        if (homens > 0){
            mediah = idadeh/homens;
        }
        if (quantexp > 0){
            mediamexp = idademulheresexp/quantexp;
        }

        System.out.printf("Número de candidatos do sexo feminino: %d\n",mulheres);
        System.out.printf("Número de candidatos do sexo masculino: %d\n",homens);
        System.out.printf("Média de idade dos homens: %d\n",mediah);
        System.out.printf("Média de idade das mulheres com experiência: %d\n",mediamexp);
    }
}
