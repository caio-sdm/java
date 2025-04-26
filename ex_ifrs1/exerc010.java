package ex_ifrs1;

public class exerc010 {
    public static void main(String[]args){
        double lab, sem, fin, media;

        System.out.print("Digite a nota do Trabalho de Laboratório: ");
        lab = Double.parseDouble(System.console().readLine());
        System.out.print("Digite a nota da Avaliação Final: ");
        sem = Double.parseDouble(System.console().readLine());
        System.out.print("Digite a nota do Exame Final: ");
        fin = Double.parseDouble(System.console().readLine());

        lab = lab * 2;
        sem = sem * 3;
        fin = fin * 5;
        media = (lab+sem+fin)/10;

        if (media > 10){
            System.out.print("Hell nah");
        }else if (media >=8){
            System.out.printf("Média: %.2f -> Conceito: A",media);
        }else if (media >=7){
            System.out.printf("Média: %.2f -> Conceito: B",media);
        }else if (media >=6){
            System.out.printf("Média: %.2f -> Conceito: C",media);
        }else if (media >=5){
            System.out.printf("Média: %.2f -> Conceito: D",media);
        }else if (media >=0){
            System.out.printf("Média: %.2f -> Conceito: E",media);
        }
    }
}
