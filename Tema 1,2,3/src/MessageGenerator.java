public class MessageGenerator {


    private final String HALF_STOP = ";";
    private final String FULL_STOP = ".";

    String border;

    public MessageGenerator() {

        border = "    ";

    }

    public MessageGenerator(String a) {

        border = a;

    }

    public MessageGenerator(String b, int c) {

        border = b;

        switch (c) {
            case 1:
                System.out.println(border);
            case 2:
                System.out.println(border);
                break;
            default:
                String s = "c nu e 1 sau 2";
                System.out.println(s);

        }
    }

    public void initialize(String newBorder) {

        border = newBorder;
    }

    public void printBorder() {

        System.out.println(border);
    }


    public void writePhrase(String d) {

        System.out.println(d + HALF_STOP);
    }

    public void writeSentence(String e) {

        System.out.println(e + FULL_STOP);
    }
}
