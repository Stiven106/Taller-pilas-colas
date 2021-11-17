package com.pilasycolas;

import lombok.Data;

@Data
public class Colas {
    private NodoSimple primero;
    private NodoSimple ultimo;

    public Colas() {
        this.primero = null;
        this.ultimo = null;
    }

    public void insertarDato(String dato) {
        if (primero == null) {
            NodoSimple nuevo = new NodoSimple(dato);
            primero = nuevo;
            ultimo = nuevo;
        } else {
            NodoSimple nuevo = new NodoSimple(dato);
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }
    }

    public String mostrar() {
        String contenido = "";
        if (primero != null) {
            contenido = contenido + primero.getDato() + "\n";
            if(primero.getSiguiente() != null ) {
                NodoSimple aux = primero.getSiguiente();
                while (aux != null) {
                    contenido = contenido +  aux.getDato() + "\n";
                    aux = aux.getSiguiente();
                }
            }
        }
        return contenido;
    }

    public void eliminarPrimero() {
        if (primero != null) {
            primero = primero.getSiguiente();
        }
    }
}
