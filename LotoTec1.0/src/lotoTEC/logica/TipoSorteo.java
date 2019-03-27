/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotoTEC.logica;


public enum TipoSorteo {
   LOTERIA(1,"Loteria"), LOTTO(2,"Lotto"), BINGO(3,"Bingo"), TIEMPO(4,"Tiempos");
    private int code;
    private String tipo;


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    

   private TipoSorteo(int code,String tipo) {
        this.tipo = tipo;
        this.code = code;
    }
}
