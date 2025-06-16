package ex__ifrs4;

public class ex003 {
    public static boolean primo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main (String[]args){
        System.out.print("Numeros primos, de 1 a 100: \n");
        for (int i = 1; i <= 100; i++){
            if (primo(i)){
                System.out.print(i + " ");
            }
        }
        System.out.print("\n");
    }
}
