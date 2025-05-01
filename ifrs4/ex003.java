package ifrs4;

public class ex003 {
    public static void main(String[]args){
        int n;
        String bin;

        System.out.print("Escreva um número em binário: ");
        bin = System.console().readLine();

        n = Integer.parseInt(bin, 2);
        System.out.printf("'%s' representa '%d' em decimal", bin,n);
    }
}
