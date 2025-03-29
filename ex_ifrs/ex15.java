package ex_ifrs;

public class ex15 {
    public static void main(String[]args){
        double tempc, tempf;

        System.out.print("Informe a temperatura em Celcius: ");
        tempc = Double.parseDouble(System.console().readLine());
        tempf = ((9 * tempc )/5)+32;
        System.out.printf("%.2fºC é igual a %.1fºF", tempc, tempf);
    }
}
