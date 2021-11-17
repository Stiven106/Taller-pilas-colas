package com.pilasycolas.taller;

import com.pilasycolas.NodoSimple;

import lombok.Data;

@Data
public class Pilas {
    private NodoSimple peek;

    public Pilas() {
        this.peek = null;
    }

    public boolean listaVacia() {
        return peek == null;
    }

    public void eliminarDeLaCima() {
        if (peek != null) {
            peek = peek.getSiguiente();
        }
    }

    public void InsertarEnLaCima(String dato) {
        NodoSimple nuevoNodo = new NodoSimple(dato);
        if (peek == null) {
            peek = nuevoNodo;
        } else {
            nuevoNodo.setSiguiente(peek);
            peek = nuevoNodo;
        }
    }

    public String mostrar() {
        String contenido = "\n";
        if (!listaVacia()) {
            contenido = contenido + peek.getDato() + "\n";
            if(peek.getSiguiente() != null) {
                NodoSimple aux = peek.getSiguiente();
                while (aux != null) {
                    contenido = contenido + aux.getDato() + "\n";
                    aux = aux.getSiguiente();
                }
            }
        }
        return contenido;
    }

}
