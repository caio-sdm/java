public class exerc001 {
    public static void main(String[] args){
        double num1, num2, dif;

        System.out.print("Digite um número: ");
        num1 = Double.parseDouble(System.console().readLine());

        System.out.print("Digite outro número: ");
        num2 = Double.parseDouble(System.console().readLine());

        if (num1==num2){
            System.out.printf("A diferença entre %.2f e %.2f é igual a 0",num1,num2);
        } else{
            if (num1 > num2){
                dif = num1-num2;
                System.out.printf("A diferença entre %.2f e %.2f é igual a %.2f",num1,num2,dif);
            }
            if (num1 < num2){
                dif = num2-num1;
                System.out.printf("A diferença entre %.2f e %.2f é igual a %.2f",num1,num2,dif);
            }
        }
    }
}
