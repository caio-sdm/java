package ifrs3.ex002;

public class ex002 {
    public static void main (String[]args){
        int placa, fim;

        System.out.print("Escreva os digitos da placa: ");
        placa = Integer.parseInt(System.console().readLine());

        fim = placa % 10;

        switch (fim){
            case 0:
                System.out.print("Vistoria em Janeiro do próximo ano");
                break;
            case 1:
                System.out.print("Vistoria em Fevereiro do próximo ano");
                break;
            case 2:
                System.out.print("Vistoria em Março do próximo ano");
                break;
            case 3:
                System.out.print("Vistoria em Abril do próximo ano");
                break;
            case 4:
                System.out.print("Vistoria em Maio do próximo ano");
                break;
            case 5:
                System.out.print("Vistoria em Junho do próximo ano");
                break;
            case 6:
                System.out.print("Vistoria em Setembro do próximo ano");
                break;
            case 7:
                System.out.print("Vistoria em Outubro do próximo ano");
                break;
            case 8:
                System.out.print("Vistoria em Novembro do próximo ano");
                break;
            case 9:
                System.out.print("Vistoria em Dezembro do próximo ano");
                break;
            default:
                System.out.print("Insira um valor válido");
        }
    }
}
