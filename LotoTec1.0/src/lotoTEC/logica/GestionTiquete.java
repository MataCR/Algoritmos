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
public class GestionTiquete {
    private DoubleLinkedList<Tiquete> listaTiquete;

    public GestionTiquete() {
        this.listaTiquete = new DoubleLinkedList<>();
    }

    public DoubleLinkedList<Tiquete> getListaTiquete() {
        return listaTiquete;
    }

    public void setListaTiquete(DoubleLinkedList<Tiquete> listaTiquete) {
        this.listaTiquete = listaTiquete;
    }
    
    public void crearTiquete(Tiquete tiquete){
        this.listaTiquete.insert(tiquete);
    }
    
    public void eliminarTiquete(Tiquete tiquete){
        this.listaTiquete.delete(tiquete);
    }
    
    public void editarTiquete(Tiquete tiqueteEditar, Tiquete tiqueteFinal){
        this.listaTiquete.update(tiqueteEditar, tiqueteFinal);
    }
    
    public Tiquete consultarTiquetePorNumero(int numero){
        DoubleLinkedNode<Tiquete> temp = this.listaTiquete.getHead().getNext();
        if (this.listaTiquete.getSize() == 0) {
            System.out.println("Lista vacia"); //cambiar por alert 
        }
        while (temp != null) {            
            if (temp.getElement().getNumero() == numero) {
                break;
            }
            temp = temp.getNext();
        }
        if (temp == null) {
            System.out.println("No se encuentra");
        }
        return temp.getElement();
    }
    
        public Tiquete consultarTiquetePorPrecio(int precio){
        DoubleLinkedNode<Tiquete> temp = this.listaTiquete.getHead().getNext();
        if (this.listaTiquete.getSize() == 0) {
            System.out.println("Lista vacia"); //cambiar por alert 
        }
        while (temp != null) {            
            if (temp.getElement().getPrecio() == precio) {
                break;
            }
            temp = temp.getNext();
        }
        if (temp == null) {
            System.out.println("No se encuentra");
        }
        return temp.getElement();
    }
   //DEVUELVE UNA LISTA PARA MODULAR EN LA TABLA DE LOS TIQUETES EN EL RANGO DE PRECIO     
   public DoubleLinkedList<Tiquete> consultarRangoPrecio(int precioInicial, int precioFinal){
        DoubleLinkedNode<Tiquete> temp = this.listaTiquete.getHead().getNext();
        DoubleLinkedList<Tiquete> listaPrecios = new DoubleLinkedList<>();
        while (temp!=null) {           
            if (temp.getElement().getPrecio()< precioFinal && temp.getElement().getPrecio()> precioInicial) {
                listaPrecios.insert(temp.getElement());
            }
            temp = temp.getNext();
       }
        return listaPrecios;
    }
   
  public void consultarPrecioDolares(Tiquete tiquete){
      int dolares = 0;
      dolares = tiquete.getPrecio()/610;
      System.out.println("Precio en dolares de tiquete es: "+dolares);//CAMBIAR POR ALERT
  }
}
