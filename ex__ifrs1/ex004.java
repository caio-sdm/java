package ex__ifrs1;

public class ex004 {
    public static void main (String[]args){
        double salbruto, salliquido, aliquota=0, inss=0, folhapagto=0, totalimp=0;
        int funcionarios=1;

        while (funcionarios <= 58){
            System.out.printf("\nFuncionário %d\n--------------\n",funcionarios);
            System.out.print("Salário bruto: R$ ");
            salbruto = Double.parseDouble(System.console().readLine());

            if (salbruto>4664.68){
                aliquota = salbruto * (27.5/100);
            } else if (salbruto>3751.06){
                aliquota = salbruto * (22.5/100);
            } else if (salbruto>2826.66){
                aliquota = salbruto * (15.0/100);
            } else if (salbruto>1903.99){
                aliquota = salbruto * (7.5/100);
            }else{
                aliquota = 0;
            }

            if (salbruto<1693.72){
                inss = salbruto * (8.0/100);
            }
            else if (salbruto<2822.90){
                inss = salbruto * (9.0/100);
            }
            else {
                inss = salbruto * (11.0/100);
            }

            salliquido = salbruto - aliquota - inss - (salbruto * (4.5/100));
            System.out.printf("salário líqido: R$%.2f\n",salliquido);
            folhapagto += salliquido;
            totalimp += aliquota + inss;

            funcionarios++;
        }
        System.out.printf("\nFolha de pagamento: R$ %.2f",folhapagto);
        System.out.printf("\nTotal de impostos: R$ %.2f",totalimp);
    }
}
