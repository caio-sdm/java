package ex__ifrs1;

public class ex011 {
    public static void main (String[]args){
        char resposta;

        System.out.print("Responda as perguntas apenas com S (sim) ou N (não)\n=-=-=-=-=-=-=-=-=-=-=-=\n");

        System.out.println("Seu animal é mamífero?");
        resposta = System.console().readLine().charAt(0);
        if (resposta == 'S' || resposta == 's'){
            System.out.println("É quadrúpede? ");
            resposta = System.console().readLine().charAt(0);
            if (resposta == 'S' || resposta == 's'){
                System.out.println("É carnívoro? ");
                resposta = System.console().readLine().charAt(0);
                if (resposta == 'S' || resposta == 's'){
                    System.out.print("É um Leão!" + new String (Character.toChars(0x1F981)));
                }else{
                    System.out.println("É herbívoro?");
                    resposta = System.console().readLine().charAt(0);
                    if (resposta == 'S' || resposta == 's'){
                        System.out.print("É um Cavalo!" + new String (Character.toChars(0x1F434)));
                    }
                }
            }else{
                System.out.print("É bípede?");
                resposta = System.console().readLine().charAt(0);
                if (resposta == 'S' || resposta == 's'){
                    System.out.println("É onívoro?");
                    resposta = System.console().readLine().charAt(0);
                    if (resposta == 'S' || resposta == 's'){
                        System.out.print("É um Humano!" + new String (Character.toChars(0x1F9D1))+new String (Character.toChars(0x1F468)));
                    }else {
                        System.out.print("É frutívoro?");
                        resposta = System.console().readLine().charAt(0);
                        if (resposta == 'S' || resposta == 's') {
                            System.out.print("É um Macaco!" + new String(Character.toChars(0x1F412)));
                        }
                    }
                }else{
                    System.out.print("É voador?");
                    resposta = System.console().readLine().charAt(0);
                    if (resposta == 'S' || resposta == 's') {
                        System.out.print("É um Morcego!" + new String(Character.toChars(0x1F987)));
                    }else {
                        System.out.print("É aquático?");
                        resposta = System.console().readLine().charAt(0);
                        if (resposta == 'S' || resposta == 's') {
                            System.out.print("É uma Baleia!" + new String(Character.toChars(0x1F40B)));
                        }
                    }
                }
            }
        }else{
            System.out.print("É uma ave?");
            resposta = System.console().readLine().charAt(0);
            if (resposta == 'S'||resposta == 's'){
                System.out.print("É uma ave não-voadora?");
                resposta = System.console().readLine().charAt(0);
                if (resposta == 'S' || resposta == 's') {
                    System.out.print("Vive em regiões tropiciais?");
                    resposta = System.console().readLine().charAt(0);
                    if (resposta == 'S' || resposta == 's') {
                        System.out.print("É um Avestruz!");
                    }else{
                        System.out.print("Vive em regiões polares?");
                        resposta = System.console().readLine().charAt(0);
                        if (resposta == 'S' || resposta == 's') {
                            System.out.print("É um Penguim!"+new String(Character.toChars(0x1F427)));
                        }
                    }
                }else{
                    System.out.print("É nadadora?");
                    resposta = System.console().readLine().charAt(0);
                    if (resposta == 'S' || resposta == 's') {
                        System.out.print("É um Pato!"+new String(Character.toChars(0x1F986)));
                    }else{
                        System.out.print("É uma ave de rapina??");
                        resposta = System.console().readLine().charAt(0);
                        if (resposta == 'S' || resposta == 's') {
                            System.out.print("É uma Águia!"+new String(Character.toChars(0x1F985)));
                        }
                    }
                }
            }else{
                System.out.print("É um réptil?");
                resposta = System.console().readLine().charAt(0);
                if (resposta == 'S'||resposta == 's') {
                    System.out.print("tem casco?");
                    resposta = System.console().readLine().charAt(0);
                    if (resposta == 'S' || resposta == 's') {
                        System.out.print("É uma Tartaruga!" + new String(Character.toChars(0x1F422)));
                    } else {
                        System.out.print("É carnívoro?");
                        resposta = System.console().readLine().charAt(0);
                        if (resposta == 'S' || resposta == 's') {
                            System.out.print("É um Crocodilo!" + new String(Character.toChars(0x1F40A)));
                        } else {
                            System.out.print("Tem patas?");
                            resposta = System.console().readLine().charAt(0);
                            if (resposta == 'N' || resposta == 'n') {
                                System.out.print("É uma Cobra!" + new String(Character.toChars(0x1F40D)));
                            }
                        }
                    }
                }
            }
        }
    }
}
