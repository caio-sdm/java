public class ex003 {
    public static void main(String[] args){
        double nota, media, soma;
        int lidas;
        soma = 0;
        lidas = 0;

        System.out.printf("Para encerrar, digite um número negativo no lugar da nota :D\n");
        System.out.print("Nota 1: ");
        nota = Double.parseDouble(System.console().readLine());

        while (nota >= 0){
            soma = soma + nota;
            lidas = lidas + 1;
            System.out.printf("Nota %d: ", lidas);
            nota = Double.parseDouble(System.console().readLine());
        }

        media = soma / lidas;
        System.out.printf("A média das notas é: %.1f\n", media);
    }
}
