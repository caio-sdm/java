package ex_ifrs;

public class ex11 {
    public static void main(String[]args){
        double nas, ida, idm, idd, ids;

        System.out.print("Informe seu ano de nascimento: ");
        nas = Double.parseDouble(System.console().readLine());
        ida = 2025 - nas;
        idm = ida * 12;
        idd = ida * 365;
        ids = ida * 52;

        System.out.printf("Idade em anos: %.1f\nIdade em meses: %.1f\nIdade em semanas: %.1f\nIdade em dias: %.1f", ida, idm, ids, idd);
    }
}
