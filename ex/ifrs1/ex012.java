package ex.ifrs1;

public class ex012 {
    public static void main(String[]args){
        String[] dias = {
                "frist","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"
        };
        String[] presentes = {
            "and a partridge in a pear tree",
            "two turtle doves",
            "three french hens",
            "four calling birds",
            "five gold rings",
            "six geese a-laying",
            "seven swans a-swimming",
            "eight maid a-milking",
            "nine ladies waiting",
            "ten lords a-leaping",
            "eleven pipers piping",
            "twelve drummers drumming"
        };

        System.out.print("------\"The Twelve Days of Christmas\"------\n\n");

        for (int i = 0; i < 12; i++){
            System.out.print("\nOn the "+dias[i]+" day of Christmas, my love gave to me a ");
            for (int j = i; j >= 0; j--){
                if (j == 0 && i !=0){
                    System.out.print(presentes[j]+"\n");
                }else{
                    System.out.print(presentes[j]+",\n");
                }
            }
        }
    }
}
