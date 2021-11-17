package com.pilasycolas;

import javax.swing.JOptionPane;

import com.pilasycolas.taller.Pilas;

public class pilasEjercicio {
    public static void main(String[] args) {
        Pilas pila1 = new Pilas();
        int opt;

        do {
            opt = Integer.parseInt(JOptionPane.showInputDialog(
                    "Por favor escoja una opcion: \n1. Para ingresar un caracter \n2. Para ver la pila"));

            switch (opt) {
            case 1: {
                int opcion = Integer.parseInt(JOptionPane.showInputDialog(
                        "Por favor escoja una opcion (1, 2, 3 o 4): \n1. Para '(' \n2. Para ')'\n3. Para '['\n4. Para ']'"));

                String caracter = null;
                if (opcion == 1) {
                    caracter = "(";
                } else if (opcion == 2) {
                    caracter = ")";
                } else if (opcion == 3) {
                    caracter = "[";
                } else if (opcion == 4) {
                    caracter = "]";
                } else {
                    JOptionPane.showMessageDialog(null, "Valor ingresado no valido.");
                    break;
                }

                if (caracter.equals("(") || caracter.equals("[")) {
                    pila1.InsertarEnLaCima(caracter);
                } else if (caracter.equals(")") || caracter.equals("]")) {
                    if (pila1.listaVacia()) {
                        JOptionPane.showMessageDialog(null, "Ha ocurrido un error: La lista esta vacia.");
                    } else {
                        if (caracter.equals(")") && pila1.getPeek().getDato().equals(("("))) {
                            pila1.eliminarDeLaCima();
                            System.out.println(pila1.getPeek());
                        } else {
                            if (pila1.getPeek().getDato().equals("[") && caracter.equals("]")) {
                                pila1.eliminarDeLaCima();
                            } else {
                                JOptionPane.showMessageDialog(null,
                                        "Ha ocurrido un error, por favor intente nuevamente.");
                            }
                        }
                    }
                }

                if (!caracter.equals("(") && !caracter.equals("[") && !caracter.equals(")") && !caracter.equals("]")) {
                    pila1.InsertarEnLaCima(caracter);
                }
                break;
            }
            case 2: {
                JOptionPane.showMessageDialog(null, "pila: " + pila1.mostrar());
                break;
            }
            }

        } while (opt != 3);

    }
}
