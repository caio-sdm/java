package alternativos;

public class ex4 {
    public static void main (String[]args){
        int sort, n = 0;

        sort = (int)(Math.random()*100+1);

        do{
            System.out.print("\nPalpite: ");
            n = Integer.parseInt(System.console().readLine());

            if (n > sort){
                System.out.print("Muito Alto!");
            } else if (n < sort) {
                System.out.print("Muito Baixo!");
            } else {
                System.out.print("Acertou! :D");
            }
        } while (sort !=n);
    }
}
