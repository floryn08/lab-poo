package com.poo.tema8;

import java.util.List;

public class Cont<T> {

    private String userName;
    private List<String> IBAN;
    private T codPin;

    public Cont(String userName, List<String> IBAN, T codPin) {
        super();
        this.IBAN = IBAN;
        this.userName = userName;
        this.codPin = codPin;
    }

    public String getUserName() {
        return userName;
    }

    public List<String> getIBAN() {
        return IBAN;
    }

    public T getCodPin() {
        return codPin;
    }

    public void setCodPin(T codPin) {
        this.codPin = codPin;
    }

}
