public class ex002 {
    public static void main(String[] args){
        int estuds, soma, notas, lidas;
        double media;

        System.out.print("Número de estudantes da turma: ");
        estuds = Integer.parseInt(System.console().readLine());
        soma = 0;
        lidas= 0;

        while (lidas < estuds){
            System.out.printf("Nota %d: ", lidas+1);
            notas = Integer.parseInt(System.console().readLine());
            soma = soma + notas;
            lidas++;
        }

        media = (double) soma / estuds;
        System.out.printf("Média da turma: %.1f \n", media);
    }
}
