package com.pilasycolas;

import javax.swing.JOptionPane;

import com.pilasycolas.taller.Pilas;

public class colasEjercicio {
    // dabale arroz a la zorra el abad
    public static void main(String[] args) {
        Colas cola = new Colas();
        Pilas pila = new Pilas();

        String palabra = JOptionPane.showInputDialog("Por favor digite la palabra a comparar").toLowerCase();
        String palabra2 = "";

        for (int i = 0; i < palabra.length(); i++) {
            palabra = palabra.replace(" ", "");
            palabra2 = String.valueOf(palabra.charAt(i));
            pila.InsertarEnLaCima(palabra2);
            cola.insertarDato(palabra2);
        }

        do {
            if (cola.getPrimero().getDato().equals(pila.getPeek().getDato())) {
                pila.eliminarDeLaCima();
                cola.eliminarPrimero();
            } else {
                JOptionPane.showMessageDialog(null, "No es palindroma");
                break;
            }
        } while (cola.getPrimero() != null && pila.getPeek() != null);
        if (pila.getPeek() == null && cola.getPrimero() == null) {
            JOptionPane.showMessageDialog(null, "Es palindroma");
        }
        cola.setPrimero(null);
        cola.setUltimo(null);
        pila.setPeek(null);
    }
}
