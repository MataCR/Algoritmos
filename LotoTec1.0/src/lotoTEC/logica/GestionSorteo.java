/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.logica;

import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import lotoTEC.estructuras.DoubleLinkedList;
import lotoTEC.estructuras.DoubleLinkedNode;

/**
 *
 * @author Mata
 */
public class GestionSorteo {
    private DoubleLinkedList<Sorteo> listaSorteo;

    public GestionSorteo() {
        this.listaSorteo=new DoubleLinkedList<>();
    }
    public GestionSorteo getSorteo(){
        return this;
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
//    Crea una lista y guarda todos los sorteos por ese nombre y lo muestra por la pantalla
    public DoubleLinkedList<Sorteo> consultarPorNombre(String nombre){
        DoubleLinkedList<Sorteo> sorteos = new DoubleLinkedList<>();
        DoubleLinkedNode<Sorteo> temp = this.listaSorteo.getHead();
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
    
//    Devuelve un sorteo de la lista de sorteos de la gestion con el codigo ingresado
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
    //Este metodo se utiliza de la atencion de pedidos para actualizar los tiquetes de esta lista
    public void actualizarCompra(Tiquete tiqueteUsuario){
        DoubleLinkedNode<Sorteo> temp = this.listaSorteo.getHead();
        Tiquete tiqueteRemp = tiqueteUsuario;
        tiqueteRemp.setUsuario(null);
        while (temp != null) {            
            if (temp.getElement().equals(tiqueteUsuario.getSorteo())) {
                temp.getElement().getGestorTiquetes().getListaTiquete().update(tiqueteRemp, tiqueteUsuario);
            }
            temp = temp.getNext();
        }
    }
    //Este metodo adiciona a la lista de sorteos el tiquete por el codigo del sorteo
    public void añadirTiquete(Tiquete tiquete,int codigo){
        DoubleLinkedNode<Sorteo> temp = this.listaSorteo.getHead();
        
        while (temp != null) {            
            if (temp.getElement().getCodigo() == codigo) {
                temp.getElement().getGestorTiquetes().crearTiquete(tiquete);
            }
            temp = temp.getNext();
        }
        
     
    }
    // este metodo guarda en una lista todos los sorteos de un mismo tipo y la retorna
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
    //este metodo gaurda en una lista todos los sorteos de la misma fecha y los retorna
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
    // este sorteo usa un numero random para ver quien es el ganador del sorteo
    public void sortear(Sorteo sorteo){
        DoubleLinkedNode<Tiquete> temp = sorteo.getGestorTiquetes().getListaTiquete().getHead();
        int x = 0;
        for (int i = 0; i < sorteo.getGestorTiquetes().getListaTiquete().getSize(); i++) { 
           x = x+1;
        }
        int randomNum = ThreadLocalRandom.current().nextInt(1, x + 1);
        
        for (int z = 0; z < sorteo.getGestorTiquetes().getListaTiquete().getSize(); z++) { 
            if (temp.getElement().getNumero() == randomNum) {
               JOptionPane.showMessageDialog(null, "El ganador es tiquete numero: "+temp.getElement().getNumero()); 
            }
            temp =temp.getNext();
        }
    }
    
 
}
