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
public class GestionPedido {
    GestionSorteo sorteos;
    DoubleLinkedList<Usuario> colaUsuario;

    public GestionPedido(GestionSorteo sorteos) {
        this.sorteos = sorteos;
        this.colaUsuario= new DoubleLinkedList<>();
    }

    public GestionSorteo getSorteos() {
        return sorteos;
    }

    public void setSorteos(GestionSorteo sorteos) {
        this.sorteos = sorteos;
    }
    
    public void realizarPedido(Usuario usuario, Tiquete tiquete){
        usuario.getTiquetesComprados().insert(tiquete);
        this.colaUsuario.insert(usuario);
    }
    
    public DoubleLinkedList<Tiquete> consultarPedidos(int cedula){
        DoubleLinkedNode<Usuario> temp = this.colaUsuario.getHead();
         
        while (temp.getNext() != null) { 
            System.out.println("ENTRO AL WHILE");
            if (temp.getElement().getCedula() == cedula) {
                break;
            }
            temp = temp.getNext();
        }
        
        
        return temp.getElement().getTiquetesComprados();
    }
    
    public void eliminarPedido(Usuario usuario,Tiquete tiquete){
        DoubleLinkedNode<Usuario> temp = this.colaUsuario.getHead().getNext();
        while (temp.getNext() != null) {  
            if (temp.getElement().equals(usuario)) {
                usuario.getTiquetesComprados().delete(tiquete);
                System.out.println("Se ha eliminado");
            }
            temp = temp.getNext();
        }
    }
    
}
