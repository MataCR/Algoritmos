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
public class GestionSorteo {
    private DoubleLinkedList<Sorteo> listaSorteo;

    public GestionSorteo() {
        this.listaSorteo=new DoubleLinkedList<Sorteo>();
    }

    public DoubleLinkedList<Sorteo> getListaSorteo() {
        return listaSorteo;
    }

    public void setListaSorteo(DoubleLinkedList<Sorteo> listaSorteo) {
        this.listaSorteo = listaSorteo;
    }

    public void agregarSorteo(Sorteo sorteo){
        this.listaSorteo.insert(sorteo);
    }
    public void eliminarSorteo(Sorteo sorteo){
        this.listaSorteo.delete(sorteo);
    }
    public DoubleLinkedList<Sorteo> consultarPorNombre(String nombre){
        DoubleLinkedList<Sorteo> sorteos = new DoubleLinkedList<>();
        DoubleLinkedNode<Sorteo> temp = this.listaSorteo.getHead().getNext();
        if (this.listaSorteo.getSize() == 0) {
            System.out.println("Lista esta vacia"); //CAMBIAR POR ALERT
        }
        while (temp != null) {            
            if (temp.getElement().getNombreSorteo().equals(nombre)) {
                sorteos.insert(temp.getElement());
            }
            temp = temp.getNext();
        }
        return sorteos;
    }
    public Sorteo consultarPorCodigo(int codigo){
        DoubleLinkedNode<Sorteo> temp = this.listaSorteo.getHead();
        
        while (temp != null) {            
            if (temp.getElement().getCodigo() == codigo) {
                break;
            }
            temp = temp.getNext();
        }
        
        return temp.getElement();
    }
    
    public void añadirTiquete(Tiquete tiquete,int codigo){
        DoubleLinkedNode<Sorteo> temp = this.listaSorteo.getHead();
        
        while (temp != null) {            
            if (temp.getElement().getCodigo() == codigo) {
                temp.getElement().getGestorTiquetes().crearTiquete(tiquete);
            }
            temp = temp.getNext();
        }
        
     
    }
    
    public DoubleLinkedList<Sorteo> consultarTipo(TipoSorteo tipo){
        DoubleLinkedList<Sorteo> sorteos = new DoubleLinkedList<>();
        DoubleLinkedNode<Sorteo> temp = this.listaSorteo.getHead();
        if (this.listaSorteo.getSize() == 0) {
            System.out.println("Lista esta vacia"); //CAMBIAR POR ALERT
        }
        while (temp != null) {            
            if (temp.getElement().getTipo().equals(tipo)) {
                sorteos.insert(temp.getElement());
            }
            temp = temp.getNext();
        }       
        return sorteos;       
    }
    
    public DoubleLinkedList<Sorteo> consultarFecha(String fecha){
        DoubleLinkedList<Sorteo> sorteos = new DoubleLinkedList<>();
        DoubleLinkedNode<Sorteo> temp = this.listaSorteo.getHead();
        while (temp != null) {            
            if (temp.getElement().getFecha().equals(fecha)) {
                sorteos.insert(temp.getElement());
            }         
            temp = temp.getNext();
        }
        
       return sorteos; 
    }
    
 
}
