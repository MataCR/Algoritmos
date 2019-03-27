/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.logica;

import lotoTEC.estructuras.DoubleLinkedList;
import lotoTEC.estructuras.DoubleLinkedNode;

/**
 *
 * @author Mata
 */
public class GestionUsuarios {
    private DoubleLinkedList<Usuario> tiquetesComprados = new DoubleLinkedList<Usuario>();

    public GestionUsuarios() {
    }

    public DoubleLinkedList<Usuario> getTiquetesComprados() {
        return tiquetesComprados;
    }

    public void setTiquetesComprados(DoubleLinkedList<Usuario> tiquetesComprados) {
        this.tiquetesComprados = tiquetesComprados;
    }
    
    public void hacerPedido(Usuario usuario, int codigoSorteo){
        
    }
}
