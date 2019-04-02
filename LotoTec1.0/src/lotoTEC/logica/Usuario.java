/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.logica;

import lotoTEC.estructuras.DoubleLinkedList;

/**
 *
 * @author Mata
 */
public class Usuario {
  private String nombre, fechaNac, direccion, correo;
  private int cedula, telefono;
  private GestionSorteo gestionSorteo;
  private DoubleLinkedList<Tiquete> tiquetesComprados ;
   
    public Usuario(String nombre, String fechaNac, String direccion, String correo, int cedula, int telefono) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.correo = correo;
        this.cedula = cedula;
        this.telefono = telefono;
        this.gestionSorteo = new GestionSorteo();
        this.tiquetesComprados = new DoubleLinkedList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public GestionSorteo getGestionSorteo() {
        return gestionSorteo;
    }

    public void setGestionSorteo(GestionSorteo gestionSorteo) {
        this.gestionSorteo = gestionSorteo;
    }

    public DoubleLinkedList<Tiquete> getTiquetesComprados() {
        return tiquetesComprados;
    }

    public void setTiquetesComprados(DoubleLinkedList<Tiquete> tiquetesComprados) {
        this.tiquetesComprados = tiquetesComprados;
    }
  
  
  
}
