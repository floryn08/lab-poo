public class UseMoney {

    public static void main(String[] args) {
        Money money1;
        Money money2;
        Money money3;
        money1 = new Money(10, 59);
        money2 = new Money(20, 70);
        money3 = money1.add(money2);

        System.out.println("" + Money.SYMBOL + money3.normalizeDollars() + '.'
                + money3.normalizeCents());
    }
}


/*
SYMBOL trebuia sa fie static
asa am rezolvat problema
**************************
Clasa useMoney(UseMoney) afiseaza money1 si money2 adunate in money3
*************************
Add are un singur parametru deoarece value este de tip Money
*/
