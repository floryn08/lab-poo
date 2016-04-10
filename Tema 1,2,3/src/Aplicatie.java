import java.util.Scanner;


public class Aplicatie extends MessageGenerator {

//    MessageGenerator m = new MessageGenerator();
    Scanner sc = new Scanner(System.in);


    private Aplicatie() {
        super();

        String linie1 = sc.nextLine();
        String linie2 = sc.nextLine();
        String linie3 = sc.nextLine();
        System.out.println(linie1 + "\n" + linie2 + "\n" + linie3);
    }

    public static void main(String[] args) {

        System.out.println("+++++++++++++++++++++++");
        new Aplicatie();
        System.out.println("+++++++++++++++++++++++");

    }

}
