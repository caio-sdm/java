package ifrs3.ex008;

public class ex008 {
    public static void main(String[]args){
        int senha;

        do{
            System.out.print("\nDigite a senha: ");
            senha = Integer.parseInt(System.console().readLine());
            if (senha != 1234){
                System.out.print("Senha errada");
            }
        } while (senha != 1234);

        System.out.print("Senha correta, acesso liberado :D");
    }
}
