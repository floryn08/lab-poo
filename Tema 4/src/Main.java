import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        String rez = null;
        String zecimale = null;

        Fractie f1 = new Fractie(2, 3);
        Fractie f2 = new Fractie(3, 4);


        Operatii o = new Operatii();

        for (int i = 0; i < 4; i++) {

//            rez = o.operatie(f1, f2);
//            System.out.println(rez);

            zecimale = o.zecimale(f1, f2);
            System.out.println(zecimale);


        }
    }
}
