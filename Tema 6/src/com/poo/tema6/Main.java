package com.poo.tema6;


public class Main {

    private static Bitcoin b1;
    private static int dollars;
    private static int bitcoin;

    public static void main(String[] args) {


        b1 = new Bitcoin() {
            @Override
            public void setBitcoins(int bitcoins) {

            }
        };

        b1.setBitcoins(1);
        bitcoin = b1.getBitcoins();
        dollars = b1.covertToDollars(bitcoin);


        System.out.println(dollars);

    }


}
