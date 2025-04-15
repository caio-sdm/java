public class ex004 {
    public static void main(String[] args){
        double num, fat, val;
        fat = 1;
        val=2;

        System.out.print("Escreva o valor que sera fatoriado: ");
        num = Double.parseDouble(System.console().readLine());

        while (val <= num){
            fat = fat * val;
            val = val + 1;
        }
        System.out.printf("O fatorial de %.1f é igual a %.1f",num,fat);
    }
}
