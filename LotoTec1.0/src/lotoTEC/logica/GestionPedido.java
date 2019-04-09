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
//    Este metodo guarda los tiquetes a pedir en la lista de tiquetes del usuario
    public void cargarPedido(Usuario usuario, Tiquete tiquete){
        usuario.getTiquetesComprados().insert(tiquete);
    }
//    Este metodo ingresa en la cola de usuarios a atender el usuario que dio en realizar pedido
    public void realizarPedido(Usuario usuario){ 
        this.colaUsuario.insert(usuario);
    }
//    imprime la lista de pedido para efectos de pruebas en el main
    public void imprimir(){
        DoubleLinkedNode<Usuario> temp = this.colaUsuario.getHead();
        while (temp != null) {            
            System.out.println("Nombre: "+temp.getElement().getNombre()+"Edad: "+temp.getElement().getEdad());
            temp = temp.getNext();
        }
    }
//    este metodo crea una lista y guarda los pedidos del usuario con su cedula
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
//    elimina el pedido del usuario
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
//    este metodo recorre la lista del usuario y cada tiquete lo actualiza en la lista de sorteos asi como elimina el usuario de la cola
    public void atenderPedido(){
        Usuario usuarioAtendido = this.colaUsuario.getHead().getElement();
        this.colaUsuario.delete(usuarioAtendido);
        DoubleLinkedNode<Tiquete> temp = usuarioAtendido.getTiquetesComprados().getHead();
        System.out.println("Atendiendo pedido");
        while (temp != null) {      
            this.sorteos.actualizarCompra(temp.getElement());
            temp = temp.getNext();
        }
    }
//    este metodo busca un tiquete dentro del sorteo por su numero
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
