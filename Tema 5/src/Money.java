public class Money {
    // Data fields
    public static final char SYMBOL = '$';
    private long dollars;
    private long cents;

    public Money()
// Constructor: Sets dollars and cents to 0
    {
        dollars = 0;
        cents = 0;
    }

    public Money(long initDollars, long initCents)
// Constructor: Sets dollars and cents to parameter values
    {
        dollars = initDollars;
        cents = initCents;
    }

    public void initialize(long newDollars, long newCents)
// Initializes dollars and cents
    {
        dollars = newDollars;
        cents = newCents;
    }

    public long dollarsAre()
// Returns dollars
    {
        return dollars;
    }

    public long centsAre()
// Returns cents
    {
        return cents;
    }

    public void print()
// Prints dollars and cents on System.out
    {
        System.out.print("" + SYMBOL + dollars + '.' + cents);
    }

    public Money add(Money value)
// Returns sum of object plus value.
    {
        Money result = new Money();
        result.cents = cents + value.cents;
        result.dollars = dollars + value.dollars;
        return result;
    }

    public long normalizeDollars() {

        if (cents >= 100) {
            dollars++;
//            cents = cents - 100;

        }
        return dollars;

    }

    public long normalizeCents() {

        if (cents >= 100) {
//            dollars++;
            cents = cents - 100;

        }


        return cents;
    }
}