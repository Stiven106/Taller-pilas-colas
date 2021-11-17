package com.pilasycolas;

import lombok.Data;

@Data
public class NodoSimple {
    private String dato;
    private NodoSimple siguiente;

    public NodoSimple(String dato) {
        this.dato = dato;
        this.siguiente = null;
    }

}
