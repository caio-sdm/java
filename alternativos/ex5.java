package alternativos;

public class ex5 {
    public static void main(String[]args){
        double nota, maior, menor;

        System.out.print("Escreva a nota 1: ");
        nota = Double.parseDouble(System.console().readLine());
        maior = nota;
        menor = nota;

        for (int i = 2; i <= 20; i++){
            System.out.printf("Escreva a nota %d: ",i);
            nota = Double.parseDouble(System.console().readLine());
            if (nota > maior){
                maior = nota;
            }
            if (nota < menor){
                menor = nota;
            }
        }
        System.out.printf("Maior nota: %.2f\nMenor nota: %.2f",maior,menor);
    }
}
