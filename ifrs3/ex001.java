package ifrs3;

public class ex001 {
    public static void main (String[]args){
        int dia, mes, ano;

        System.out.print("Digite o dia: ");
        dia =Integer.parseInt(System.console().readLine());

        System.out.print("Digite o número do mês: ");
        mes = Integer.parseInt(System.console().readLine());

        System.out.print("Digite o ano: ");
        ano = Integer.parseInt(System.console().readLine());

        switch (mes) {
            case 1:
                System.out.printf("%d de Janeiro de %d",dia,ano);
                break;
            case 2:
                System.out.printf("%d de Fevereiro de %d",dia,ano);
                break;
            case 3:
                System.out.printf("%d de Março de %d",dia,ano);
                break;
            case 4:
                System.out.printf("%d de Abril de %d",dia,ano);
                break;
            case 5:
                System.out.printf("%d de Maio de %d",dia,ano);
                break;
            case 6:
                System.out.printf("%d de Junho de %d",dia,ano);
                break;
            case 7:
                System.out.printf("%d de Julho de %d",dia,ano);
                break;
            case 8:
                System.out.printf("%d de Agosto de %d",dia,ano);
                break;
            case 9:
                System.out.printf("%d de Setembro de %d",dia,ano);
                break;
            case 10:
                System.out.printf("%d de Outubro de %d",dia,ano);
                break;
            case 11:
                System.out.printf("%d de Novembro de %d",dia,ano);
                break;
            case 12:
                System.out.printf("%d de Dezembro de %d",dia,ano);
                break;
        }
        if (dia == 25 && mes == 12){
            System.out.print("\nNatal! Ho Ho Ho");
        }
        if (dia == 31 && mes == 10){
            System.out.print("\nHalloween! Buuuu");
        }
    }
}
