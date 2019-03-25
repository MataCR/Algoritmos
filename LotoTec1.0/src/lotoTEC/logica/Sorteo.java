/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.logica;

/**
 *
 * @author Mata
 */
public class Sorteo {
    String nombreSorteo;
    int codigo;
    String tipo;
    int emisiones;
    GestionTiquete gestorTiquetes;

    public Sorteo(String nombreSorteo, int codigo, String tipo, int emisiones) {
        this.nombreSorteo = nombreSorteo;
        this.codigo = codigo;
        this.tipo = tipo;
        this.emisiones = emisiones;
    }

    public Sorteo(String nombreSorteo, int codigo, String tipo, int emisiones, GestionTiquete gestorTiquetes) {
        this.nombreSorteo = nombreSorteo;
        this.codigo = codigo;
        this.tipo = tipo;
        this.emisiones = emisiones;
        this.gestorTiquetes = gestorTiquetes;
    }
    
    

    public String getNombreSorteo() {
        return nombreSorteo;
    }

    public void setNombreSorteo(String nombreSorteo) {
        this.nombreSorteo = nombreSorteo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEmisiones() {
        return emisiones;
    }

    public void setEmisiones(int emisiones) {
        this.emisiones = emisiones;
    }

    public GestionTiquete getGestorTiquetes() {
        return gestorTiquetes;
    }

    public void setGestorTiquetes(GestionTiquete gestorTiquetes) {
        this.gestorTiquetes = gestorTiquetes;
    }
    
    
    
}
