import java.util.Scanner;
import java.util.StringJoiner;


public class Operatii {

    public Scanner sc = new Scanner(System.in);

    public Operatii() {

    }

//    public String operatie(Fractie f1, Fractie f2) {
////        int a = 0, b = 0, c = 0, d = 0;
//        int s = 0;
//        int j = 0;
//        String x = null;
//
//        System.out.print("Operatia: ");
//        x = sc.nextLine();
//
//        switch (x) {
//
//            case "+":
//                if (f1.numitor == f2.numitor) {
//                    s = f1.numarator + f2.numarator;
//                    j = f1.numitor;
//                } else {
//                    s = f1.numarator * f2.numitor + f2.numarator * f1.numitor;
//                    j = f1.numitor * f2.numitor;
//
//                }
//                break;
//            case "-":
//                if (f1.numitor == f2.numitor) {
//                    s = f1.numarator - f2.numarator;
//                    j = f1.numitor;
//                } else {
//                    s = f1.numarator * f2.numitor - f2.numarator * f1.numitor;
//                    j = f1.numitor * f2.numitor;
//
//                }
//                break;
//
//            case "*":
//
//                s = f1.numarator * f2.numarator;
//                j = f1.numitor * f2.numitor;
//
//                break;
//
//            case "/":
//
//                s = f1.numarator * f2.numitor;
//                j = f1.numitor * f2.numarator;
//
//
//        }
//
//        return "Rezultatul " + x + " este: " + s + "/" + j;
//    }

    public String zecimale(Fractie f1, Fractie f2) {
//        int a = 0, b = 0, c = 0, d = 0;
        double s = 0;
        double j = 0;
        double rez = 0;
        String x = null;

        System.out.print("Operatia: ");
        x = sc.nextLine();

        switch (x) {

            case "+":
                if (f1.numitor == f2.numitor) {
                    s = f1.numarator + f2.numarator;
                    j = f1.numitor;
                    rez = s / j;

                } else {
                    s = f1.numarator * f2.numitor + f2.numarator * f1.numitor;
                    j = f1.numitor * f2.numitor;
                    rez = s / j;

                }
                break;
            case "-":
                if (f1.numitor == f2.numitor) {
                    s = f1.numarator - f2.numarator;
                    j = f1.numitor;
                    rez = s / j;
                } else {
                    s = f1.numarator * f2.numitor - f2.numarator * f1.numitor;
                    j = f1.numitor * f2.numitor;
                    rez = s / j;

                }
                break;

            case "*":

                s = f1.numarator * f2.numarator;
                j = f1.numitor * f2.numitor;
                rez = s / j;

                break;

            case "/":

                s = f1.numarator * f2.numitor;
                j = f1.numitor * f2.numarator;
                rez = s / j;


        }

        return "Rezultatul " + x + " este: " + rez;
    }


}
