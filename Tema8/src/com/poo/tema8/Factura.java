package com.poo.tema8;

public class Factura<T> {

    private T nrFactura;
    private String tipFactura;// ce fel de factura e
    private String numePosesor;// pentru cine e emisa factura

    public Factura(T nrFactura, String tipFactura, String numePosesor) {
        super();
        this.nrFactura = nrFactura;
        this.tipFactura = tipFactura;
        this.numePosesor = numePosesor;
    }

    public T getNrFactura() {
        return nrFactura;
    }

    public void setNrFactura(T nrFactura) {
        this.nrFactura = nrFactura;
    }

    public String getTipFactura() {
        return tipFactura;
    }

    public void setTipFactura(String tipFactura) {
        this.tipFactura = tipFactura;
    }

    public String getNumePosesor() {
        return numePosesor;
    }

    public void setNumePosesor(String numePosesor) {
        this.numePosesor = numePosesor;
    }

}
