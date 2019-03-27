/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.logica;

/**
 *
 * @author Mata
 * : el nombre del emisor, el nombre del cliente, el tipo de sorteo, el número o combinación elegida y el precio
 */
public class Tiquete {
    private String emisor, tipoSorteo;
    private int precio, numero;
   private Usuario usuario;

    public Tiquete(String emisor, String tipoSorteo, int precio, int numero, Usuario usuario) {
        this.emisor = emisor;
        this.tipoSorteo = tipoSorteo;
        this.precio = precio;
        this.numero = numero;
        this.usuario = usuario;
    }

    public Tiquete(String emisor, String tipoSorteo, int precio, int numero) {
        this.emisor = emisor;
        this.tipoSorteo = tipoSorteo;
        this.precio = precio;
        this.numero = numero;
    }
    

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getTipoSorteo() {
        return tipoSorteo;
    }

    public void setTipoSorteo(String tipoSorteo) {
        this.tipoSorteo = tipoSorteo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
