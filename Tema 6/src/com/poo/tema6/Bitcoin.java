package com.poo.tema6;


abstract class Bitcoin implements Money {

    private int dollars = 0;
    private int bitcoin = 0;

    public void setDollars(int dollars) {
        this.dollars = dollars;
    }

    public int getDollars() {
        return this.dollars;
    }

    public void setBitcoins(int bitcoins) {
        this.bitcoin = bitcoins;
    }

    public int getBitcoins() {
        return bitcoin;
    }

    public int covertToDollars(int bitcoin) {
        this.bitcoin = bitcoin * 445;

        return this.bitcoin;
    }

}
