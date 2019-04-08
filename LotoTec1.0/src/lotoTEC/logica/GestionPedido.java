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
        public DoubleLinkedList<Usuario> getColaUsuario() {
        return colaUsuario;
    }

    public void setColaUsuario(DoubleLinkedList<Usuario> colaUsuario) {
        this.colaUsuario = colaUsuario;
    }
    
    public void cargarPedido(Usuario usuario, Tiquete tiquete){
        usuario.getTiquetesComprados().insert(tiquete);
    }
    
    public void realizarPedido(Usuario usuario){ 
        this.colaUsuario.insert(usuario);
    }
    public void imprimir(){
        DoubleLinkedNode<Usuario> temp = this.colaUsuario.getHead();
        while (temp != null) {            
            System.out.println("Nombre: "+temp.getElement().getNombre()+"Edad: "+temp.getElement().getEdad());
            temp = temp.getNext();
        }
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
    
    public void atenderPedido(){
        Usuario usuarioAtendido = this.colaUsuario.getHead().getElement();
        this.colaUsuario.delete(usuarioAtendido);
        DoubleLinkedNode<Tiquete> temp = usuarioAtendido.getTiquetesComprados().getHead();
        
        while (temp != null) {      
            
            buscarPorNumero(temp.getElement().getNumero(), temp.getElement().getSorteo()).setUsuario(temp.getElement().getUsuario());
            temp = temp.getNext();
            
        }
    }
    
    public Tiquete buscarPorNumero(int numero, Sorteo sorteo){
        DoubleLinkedNode<Tiquete> temp = sorteo.getGestorTiquetes().getListaTiquete().getHead();
        Tiquete remplazar = null;
        while (temp != null) {            
            if (temp.getElement().getNumero() == numero) {
                remplazar = temp.getElement();
            }
            temp = temp.getNext();
        }
        return remplazar;
    }
    
}
