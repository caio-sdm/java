public class ex1 {
    public static void main (String[]args){
        double num, quad, cub, sqrt, cbrt;

        System.out.println("Número em quadrado, cúbico, raíz quadrada e raiz cúbica");
        System.out.print("Escreva o número: ");
        num = Double.parseDouble(System.console().readLine());

        quad = Math.pow(num, 2);
        cub = Math.pow(num, 3);
        sqrt = Math.sqrt(num);
        cbrt = Math.cbrt(num);

        System.out.printf("O quadrado de %.2f é igua a %.2f\n", num, quad);
        System.out.printf("O cubo de %.2f é igual a %.2f\n", num, cub);
        System.out.printf("A raíz quadrada de %.2f é igual a %.2f\n", num, sqrt);
        System.out.printf("A raíz cúbica de %.2f é igual a %.2f\n", num, cbrt);
    }
}
