/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.ui;

import lotoTEC.logica.GestionPedido;
import lotoTEC.logica.GestionSorteo;
import lotoTEC.logica.GestionTiquete;
import lotoTEC.logica.Sorteo;
import lotoTEC.logica.TipoSorteo;
import lotoTEC.logica.Tiquete;
import lotoTEC.logica.Usuario;

/**
 *
 * @author Mata
 */
public class NewClass {
    
    public static void main(String[] args) {

         //AQUI SE CREAN LOS 3 SORTEOS Y SE LES ASIGNA EL GESTOR DE CADA UNO DE ELLOS
         Sorteo sorteo1 = new Sorteo("sorteo1", 1, TipoSorteo.BINGO, 100, "10/10/2019");
         Sorteo sorteo15 = new Sorteo("sorteo1", 1, TipoSorteo.BINGO, 100, "10/10/2019");//PREGUNTAR ARON
         Sorteo sorteo2 = new Sorteo("sorteo2", 2, TipoSorteo.LOTERIA, 100, "10/10/2019");
         Sorteo sorteo3 = new Sorteo("sorteo3", 3, TipoSorteo.LOTTO, 100, "12/12/2019");
         //SE CREAN LOS TIQUETES DE LOS SORTEOS SE ALAMCENAN EN EL GESTOR DE ARRIBA
         Tiquete tiquete1 = new Tiquete("emisor1", "bingo", 200, 1,sorteo1);
         Tiquete tiquete2 = new Tiquete("emisor2", "bingo", 200, 2,sorteo1);
         Tiquete tiquete3 = new Tiquete("emisor1", "bingo", 200, 3,sorteo1);
         //ESTE ES EL GESTOR DEL SORTEO QUE GUARDA TODOS LOS SORTEOS
         GestionSorteo gestorSorteo = new GestionSorteo();
         //SE AGREGAN AL GESTOR LOS SORTEOS
         gestorSorteo.agregarSorteo(sorteo1);
         gestorSorteo.agregarSorteo(sorteo2);
         gestorSorteo.agregarSorteo(sorteo3);
         gestorSorteo.agregarSorteo(sorteo15);
         System.out.println("Lista de sorteos es: ");
         System.out.println(gestorSorteo.consultarFecha("10/10/2019").toString());
         System.out.println("--------------------");
         //SE PRUEBAN LOS CONSULTAR DEL GESTOR DE SORTEO
//         System.out.println(gestorSorteo.consultarPorNombre("sorteo2").getNombreSorteo());
         System.out.println(gestorSorteo.consultarPorCodigo(1).getNombreSorteo());
         //AGREGA LOS TIQUETES AL SORTEO 1
         sorteo1.getGestorTiquetes().crearTiquete(tiquete1);
         sorteo1.getGestorTiquetes().crearTiquete(tiquete2);
         sorteo1.getGestorTiquetes().crearTiquete(tiquete3);
         //SE PRUEBAN LOS CONSULTAR DEL GESTOR
//         System.out.println(sorteo1.getGestorTiquetes().consultarTiquetePorNumero(2).getEmisor());
//         sorteo1.getGestorTiquetes().eliminarTiquete(tiquete2);
//         System.out.println(sorteo1.getGestorTiquetes().consultarTiquetePorNumero(2).getEmisor());
        System.out.println("---------------------------------*");

//        Usuario usuario1 = new Usuario("nombre", 60, "direccion", "correo", 305, 0);
//        Usuario usuario11 = new Usuario("nombre", 20, "direccion", "correo", 305, 0);
//        Usuario usuario2 = new Usuario("nombre", 66, "direccion", "correo", 305, 0);
//        GestionPedido pedido = new GestionPedido(gestorSorteo);
//        pedido.cargarPedido(usuario1, tiquete1);
//        pedido.realizarPedido(usuario1);
//        pedido.cargarPedido(usuario11, tiquete2);
//        pedido.realizarPedido(usuario11);
//        pedido.cargarPedido(usuario2, tiquete3);
//        pedido.realizarPedido(usuario2);
//        pedido.imprimir();
//        System.out.println("--------------------------");
//        pedido.atenderPedido();
//        pedido.imprimir();
        
//        System.out.println("usuario 2");
//        System.out.println(usuario2.toString());
//        System.out.println("Orden de la cola");
//        System.out.println(pedido.getColaUsuario().toString());
//        System.out.println(pedido.consultarPedidos(305).toString());
//        pedido.eliminarPedido(usuario1, tiquete3);
//        System.out.println(pedido.consultarPedidos(305).toString());
    }
}
