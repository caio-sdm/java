package ifrs4;

public class ex002 {
    public static void main(String[]args){
        int n;
        String bin;
        n=0;

        do{
            bin = Integer.toString(n,2);
            System.out.printf("%d em binário é %s\n",n,bin);
            n++;
        } while (n<=100);
    }
}
