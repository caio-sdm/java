package ifrs4;

public class ex007 {
    public static void main(String[] args) {
        int i;
        double n1, n2, ex, sqrt1, cbrt1, sqrt2, cbrt2;

        System.out.print("Digite um número: ");
        n1 = Integer.parseInt(System.console().readLine());
        System.out.print("Digite outro número: ");
        n2 = Integer.parseInt(System.console().readLine());

        System.out.print("Para fazer n1 elevado a n2, digite 1\nPara raíz quadrada de ambos, digite 2\nPara raíz cúbica de ambos, digite 3\nDigite: ");
        i = Integer.parseInt(System.console().readLine());

        if (i == 1) {
            ex = Math.pow(n1, n2);
            System.out.printf("%.2f elevado a %.2f é igual a %.2f", n1, n2, ex);
        } else if (i == 2) {
            sqrt1 = Math.sqrt(n1);
            sqrt2 = Math.sqrt(n2);
            System.out.printf("A raíz quadrada de %.2f é igual a %.2f\nA raíz quadrada de %.2f é igual a %.2f", n1, sqrt1, n2, sqrt2);
        } else if (i == 3) {
            cbrt1 = Math.cbrt(n1);
            cbrt2 = Math.cbrt(n2);
            System.out.printf("A raíz cúbica de %.2f é igual a %.2f\nA raíz cúbica de %.2f é igual a %.2f", n1, cbrt1, n2, cbrt2);
        } else {
            System.out.print("Insira um valor válido");
        }
    }
}