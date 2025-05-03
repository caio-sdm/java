package ifrs3.ex009;

public class ex009 {
    public static void main(String[]args){
        int n, m, cont=2;
        n = 1;
        m = 1;

        System.out.print(m + "," + n + ",");

        do{
            int prox = n+m;
            System.out.print(prox + ",");
            n = m;
            m = prox;
            cont++;
        } while (cont < 10);


    }
}
