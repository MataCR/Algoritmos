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
public class GestionSorteo {
    private DoubleLinkedList<Sorteo> listaSorteo = new DoubleLinkedList<Sorteo>();

    public GestionSorteo() {
    }

    public DoubleLinkedList<Sorteo> getListaSorteo() {
        return listaSorteo;
    }

    public void setListaSorteo(DoubleLinkedList<Sorteo> listaSorteo) {
        this.listaSorteo = listaSorteo;
    }


    
    
}
