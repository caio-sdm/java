package alternativos;

public class ex2 {
    public static void main(String[]args){
        double A,B,C;

        System.out.print("Medida do lado A: ");
        A = Double.parseDouble(System.console().readLine());
        System.out.print("Medida do lado B: ");
        B = Double.parseDouble(System.console().readLine());
        System.out.print("Medida do lado C: ");
        C = Double.parseDouble(System.console().readLine());

        if (A+B>C && B+C>A && A+C>B) {
            if (A==B && B==C) {
                System.out.print("Triângulo Equilátero");
            }else if (A!=B && C!=B && A!=C) {
                System.out.print("Triângulo Escaleno");
            }else {
                System.out.print("Trinângulo Isóceles");
            }
        }else {
            System.out.print("Não é um triângulo");
        }
    }
}
