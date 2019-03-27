/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.ui;

import lotoTEC.logica.GestionSorteo;
import lotoTEC.logica.GestionTiquete;
import lotoTEC.logica.Sorteo;
import lotoTEC.logica.TipoSorteo;
import lotoTEC.logica.Tiquete;

/**
 *
 * @author Mata
 */
public class NewClass {
    
    public static void main(String[] args) {
        //SE CREA AQUI LOS GESTORES DE CADA SORTEO ESOTOS SORTEOS MANEJAN LOS TIQUETES DE CADA UNO
         GestionTiquete gestor1 = new GestionTiquete();
         GestionTiquete gestor2 = new GestionTiquete();
         GestionTiquete gestor3 = new GestionTiquete();
         //SE CREAN LOS TIQUETES DE LOS SORTEOS SE ALAMCENAN EN EL GESTOR DE ARRIBA
         Tiquete tiquete1 = new Tiquete("emisor1", "bingo", 200, 1);
         Tiquete tiquete2 = new Tiquete("emisor2", "bingo", 200, 2);
         Tiquete tiquete3 = new Tiquete("emisor1", "bingo", 200, 3);
         //AQUI SE CREAN LOS 3 SORTEOS Y SE LES ASIGNA EL GESTOR DE CADA UNO DE ELLOS
         Sorteo sorteo1 = new Sorteo("sorteo1", 1, TipoSorteo.BINGO, 100, "10/10/2019",gestor1);
         Sorteo sorteo2 = new Sorteo("sorteo2", 2, TipoSorteo.LOTERIA, 100, "11/11/2019",gestor2);
         Sorteo sorteo3 = new Sorteo("sorteo3", 3, TipoSorteo.LOTTO, 100, "12/12/2019",gestor3);
         //ESTE ES EL GESTOR DEL SORTEO QUE GUARDA TODOS LOS SORTEOS
         GestionSorteo gestorSorteo = new GestionSorteo();
         //SE AGREGAN AL GESTOR LOS SORTEOS
         gestorSorteo.agregarSorteo(sorteo1);
         gestorSorteo.agregarSorteo(sorteo2);
         gestorSorteo.agregarSorteo(sorteo3);
         //SE PRUEBAN LOS CONSULTAR DEL GESTOR DE SORTEO
      //   System.out.println(gestorSorteo.consultarPorNombre("sorteo2").getNombreSorteo());
      //   System.out.println(gestorSorteo.consultarPorCodigo(2).getNombreSorteo());
         //AGREGA LOS TIQUETES AL SORTEO 1
         sorteo1.getGestorTiquetes().crearTiquete(tiquete1);
         sorteo1.getGestorTiquetes().crearTiquete(tiquete2);
         sorteo1.getGestorTiquetes().crearTiquete(tiquete3);
         //SE PRUEBAN LOS CONSULTAR DEL GESTOR
         System.out.println(sorteo1.getGestorTiquetes().consultarTiquetePorNumero(2).getEmisor());
         sorteo1.getGestorTiquetes().eliminarTiquete(tiquete2);
         System.out.println(sorteo1.getGestorTiquetes().consultarTiquetePorNumero(2).getEmisor());
    }
}
