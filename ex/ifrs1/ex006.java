package ex.ifrs1;

public class ex006 {
    public static void main(String[]args){
        char conceito;
        double nota, mediaA, mediaB, mediaC, mediaD, mediaE, somA=0, somB=0, somC=0, somD=0, somE=0;
        int codigoaluno, alunos=0, alunoA=0,alunoB=0, alunoC=0, alunoD=0, alunoE=0;

        while (alunos <= 75){
            System.out.print("-------------");
            System.out.print("Aluno: ");
            codigoaluno = Integer.parseInt(System.console().readLine());
            System.out.print("Nota final: ");
            nota = Double.parseDouble(System.console().readLine());

            if (nota < 0 || nota > 10) {
                System.out.print("Insira uma nota válida (0-10)!");
                break;
            } else if (nota < 3) {
                conceito = 'E';
                somE += nota;
                alunoE++;
            } else if (nota < 5) {
                conceito = 'D';
                somD += nota;
                alunoD++;
            } else if (nota < 7) {
                conceito = 'C';
                somC += nota;
                alunoC++;
            } else if (nota < 9) {
                conceito = 'B';
                somB += nota;
                alunoB++;
            } else {
                conceito = 'A';
                somA += nota;
                alunoA++;
            }
            System.out.printf("O conceito do aluno %d é : %c",codigoaluno, conceito);
            alunos++;
        }
        mediaA = somA / alunoA;
        mediaB = somB / alunoB;
        mediaC = somC / alunoC;
        mediaD = somD / alunoD;
        mediaE = somE / alunoE;

        System.out.printf("Quantidade total de alunos: %d",alunos);
        System.out.printf("\nMédia de notas de conceito A: %.2f \nMédia de notas de conceito B: %.2f \nMédia de notas de conceito C: %.2f \nMédia de notas de conceito D: %.2f \nMédia de notas de conceito E: %.2f",mediaA,mediaB,mediaC,mediaD,mediaE);
    }
}
