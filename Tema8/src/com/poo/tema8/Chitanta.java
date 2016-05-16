package com.poo.tema8;

public class Chitanta extends Factura<Integer> {

    private int nrChitanta;

    public Chitanta(int nrFactura, String tipFactura, String numePosesor, int nrChitanta) {
        super(nrFactura, tipFactura, numePosesor);
        this.nrChitanta = nrChitanta;

    }

    public int getNrChitanta() {
        return nrChitanta;
    }
}
