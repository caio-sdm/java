package alternativos;

public class jbas {
    public static void main(String[] args) {
        int cont=1;
        int[][] matriz = new int[3][3];
        matriz = new int[3][3];
        for(int y=0; y<=3; y++){
            for(int x=0; x<=2; x++){
                matriz[x][y] = cont;
                cont++;
            }
        }
        for(int y=0; y<=3; y++){
            for(int x=0; x<=2; x++){
                System.out.print(" | "+matriz[x][y]);
            }
            System.out.println(" |");
        }
    }
}
