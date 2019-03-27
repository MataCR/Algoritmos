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
    private DoubleLinkedList<Sorteo> listaSorteo = new DoubleLinkedList<Sorteo>();

    public GestionSorteo() {
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
    public Sorteo consultarPorNombre(String nombre){
        DoubleLinkedNode<Sorteo> temp = this.listaSorteo.getHead().getNext();
        if (this.listaSorteo.getSize() == 0) {
            System.out.println("Lista esta vacia"); //CAMBIAR POR ALERT
        }
        while (temp != null) {            
            if (temp.getElement().getNombreSorteo().equals(nombre)) {
                break;
            }
            temp = temp.getNext();
        }if (temp == null) {
            System.out.println("No se encuentra");//CAMBIAR POR ALERT
        }
        return temp.getElement();
    }
    public Sorteo consultarPorCodigo(int codigo){
        DoubleLinkedNode<Sorteo> temp = this.listaSorteo.getHead().getNext();
        if (this.listaSorteo.getSize() == 0) {
            System.out.println("Lista esta vacia"); //CAMBIAR POR ALERT
        }
        while (temp != null) {            
            if (temp.getElement().getCodigo() == codigo) {
                break;
            }
            temp = temp.getNext();
        }if (temp == null) {
            System.out.println("No se encuentra");//CAMBIAR POR ALERT
        }
        
        return temp.getElement();
    }
    public Sorteo consultarTipo(TipoSorteo tipo){
        DoubleLinkedNode<Sorteo> temp = this.listaSorteo.getHead().getNext();
        if (this.listaSorteo.getSize() == 0) {
            System.out.println("Lista esta vacia"); //CAMBIAR POR ALERT
        }
        while (temp != null) {            
            if (temp.getElement().getTipo().equals(tipo)) {
                break;
            }
            temp = temp.getNext();
        }if (temp == null) {
            System.out.println("No se encuentra");//CAMBIAR POR ALERT
        }
        
        return temp.getElement();        
    }
    
    public Sorteo consultarFecha(String fecha){
        DoubleLinkedNode<Sorteo> temp = this.listaSorteo.getHead().getNext();
        if (this.listaSorteo.getSize() == 0) {
            System.out.println("Lista esta vacia"); //CAMBIAR POR ALERT
        }
        while (temp != null) {            
            if (temp.getElement().getFecha().equals(fecha)) {
                break;
            }
            temp = temp.getNext();
        }if (temp == null) {
            System.out.println("No se encuentra");//CAMBIAR POR ALERT
        }
        
        return temp.getElement();
    }
    
//    public void consultarRangoPrecio(int Precio){
//        DoubleLinkedNode<Sorteo> temp = this.listaSorteo.getHead().getNext();
//        if (this.listaSorteo.getSize() == 0) {
//            System.out.println("Lista esta vacia"); //CAMBIAR POR ALERT
//        }
//        while (temp != null) {                                                        RANGO ENTRE PRECIO DE TIQUETES
//            if (temp.getElement().getGestorTiquetes().getListaTiquete().) {
//                
//            }
//        }
//    }
}
