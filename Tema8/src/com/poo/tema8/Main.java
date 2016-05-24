package com.poo.tema8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> listaIBAN = new ArrayList<>();
        listaIBAN.add(" RO49RNCB0080005630620001");
        listaIBAN.add(" RO19RNCB0080005679854001");

        List<Integer> listaSold = new ArrayList<>();
        listaSold.add(1200);
        listaSold.add(800);
        listaSold.add(90000);

        System.out.println(listaSold);


        Cont<Integer> newCont = new Cont<Integer>("Popescu Ion", listaIBAN, 1234);

        Factura<Integer> factura = new Factura<Integer>(12, "Electrica", "Popescu Ion");
        Chitanta chitanta = new Chitanta(12, "Electrica", "Popescu Ion", 12);

        if (factura.getNumePosesor().equals(newCont.getUserName()) && factura.getNrFactura().equals(chitanta.getNrChitanta())) {
            System.out.println("Factura s-a emis corect!");
        }


    }
}
