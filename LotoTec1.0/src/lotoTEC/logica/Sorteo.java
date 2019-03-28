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
    private String nombreSorteo;
    private int codigo;
    private TipoSorteo tipo;
    private int emisiones;
    private GestionTiquete gestorTiquetes;
    private String fecha;
    


    public Sorteo(String nombreSorteo, int codigo, TipoSorteo tipo, int emisiones,String fecha) {
        this.nombreSorteo = nombreSorteo;
        this.codigo = codigo;
        this.tipo = tipo;
        this.emisiones = emisiones;
        this.fecha = fecha;
        this.gestorTiquetes = new GestionTiquete();
        
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
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

    public TipoSorteo getTipo() {
        return tipo;
    }

    public void setTipo(TipoSorteo tipo) {
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
