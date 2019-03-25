/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.logica;


public enum TipoSorteo {
   LOT("Loteria"), LOTT("Lotto"), BIN("Bingo"), TIEMP("Tiempos");

    private String tipo;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    TipoSorteo(String tipo) {
        this.tipo = tipo;
    }
}
