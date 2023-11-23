/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author bruno
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

enum Naipe {
    ESPADAS, OUROS, COPAS, PAUS
}

class Carta {
    private int valor;
    private Naipe naipe;

    public Carta(int valor, Naipe naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public int getValor() {
        return valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    @Override
    public String toString() {
        String valorCarta = Integer.toString(valor);

        if (valor == 11) valorCarta = "J";
        else if (valor == 12) valorCarta = "Q";
        else if (valor == 13) valorCarta = "K";
        else if (valor == 14) valorCarta = "A";

        return valorCarta + " de " + naipe.toString();
    }
}

