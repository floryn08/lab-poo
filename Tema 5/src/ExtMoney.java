/**
 * Created by flory on 10/04/2016.
 */
public class ExtMoney extends Money {

    private String kindOfMoney;

    public ExtMoney()
// Constructor: default kind is "real"
    {
        super();
        kindOfMoney = "real";
    }

    public ExtMoney
            (long newDollars, long newCents, String newKind)
// Constructor: kind set to newCurrency
    {
        super(newDollars, newCents);
        kindOfMoney = newKind;
    }

    public void initialize
            (long newDollars, long newCents, String newKind) {
        this.initialize(newDollars, newCents);
        kindOfMoney = newKind;
    }

    public String kindIs() {
        return kindOfMoney;
    }

    public void print() {
        super.print();
        System.out.println(" is " + kindOfMoney);
    }


}
