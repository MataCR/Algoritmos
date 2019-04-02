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
         //SE CREAN LOS TIQUETES DE LOS SORTEOS SE ALAMCENAN EN EL GESTOR DE ARRIBA
         Tiquete tiquete1 = new Tiquete("emisor1", "bingo", 200, 1);
         Tiquete tiquete2 = new Tiquete("emisor2", "bingo", 200, 2);
         Tiquete tiquete3 = new Tiquete("emisor1", "bingo", 200, 3);
         //AQUI SE CREAN LOS 3 SORTEOS Y SE LES ASIGNA EL GESTOR DE CADA UNO DE ELLOS
         Sorteo sorteo1 = new Sorteo("sorteo1", 1, TipoSorteo.BINGO, 100, "10/10/2019");
         Sorteo sorteo15 = new Sorteo("sorteo1", 1, TipoSorteo.BINGO, 100, "10/10/2019");//PREGUNTAR ARON
         Sorteo sorteo2 = new Sorteo("sorteo2", 2, TipoSorteo.LOTERIA, 100, "10/10/2019");
         Sorteo sorteo3 = new Sorteo("sorteo3", 3, TipoSorteo.LOTTO, 100, "12/12/2019");
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
         System.out.println(gestorSorteo.consultarPorCodigo(2).getNombreSorteo());
         //AGREGA LOS TIQUETES AL SORTEO 1
         sorteo1.getGestorTiquetes().crearTiquete(tiquete1);
         sorteo1.getGestorTiquetes().crearTiquete(tiquete2);
         sorteo1.getGestorTiquetes().crearTiquete(tiquete3);
         //SE PRUEBAN LOS CONSULTAR DEL GESTOR
         System.out.println(sorteo1.getGestorTiquetes().consultarTiquetePorNumero(2).getEmisor());
//         sorteo1.getGestorTiquetes().eliminarTiquete(tiquete2);
//         System.out.println(sorteo1.getGestorTiquetes().consultarTiquetePorNumero(2).getEmisor());
        System.out.println("---------------------------------*");

        Usuario usuario1 = new Usuario("nombre", "fechanac", "direccion", "correo", 305, 0);
        GestionPedido pedido = new GestionPedido(gestorSorteo);
        pedido.realizarPedido(usuario1, tiquete3);
        System.out.println(pedido.consultarPedidos(305).toString());
        pedido.eliminarPedido(usuario1, tiquete3);
        System.out.println(pedido.consultarPedidos(305).toString());
    }
}
