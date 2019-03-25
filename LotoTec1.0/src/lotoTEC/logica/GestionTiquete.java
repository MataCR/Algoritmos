/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.logica;

import lotoTEC.estructuras.DoubleLinkedList;

/**
 *
 * @author Mata
 */
public class GestionTiquete {
    private DoubleLinkedList<Tiquete> listaTiquete = new DoubleLinkedList<Tiquete>();

    public GestionTiquete() {
    }

    public DoubleLinkedList<Tiquete> getListaTiquete() {
        return listaTiquete;
    }

    public void setListaTiquete(DoubleLinkedList<Tiquete> listaTiquete) {
        this.listaTiquete = listaTiquete;
    }
    
    
}
