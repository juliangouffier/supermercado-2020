/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Guffy
 */
public class ProductoFresco extends Producto {

    // variables
    
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductoFresco(String nombre, String descripcion, String codigoDeProducto, String fechaCaducidad, String numLote, String precio,String tipoDeProducto, String fechaEnvasado, String paisOrigen) {
        super(nombre, descripcion, codigoDeProducto, fechaCaducidad, numLote, precio, tipoDeProducto);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    public ProductoFresco(String[] split){
    super(split[0], split[1], split[2], split[3], split[4], split[5], split[8]);
    this.fechaEnvasado = split[6];
    this.paisOrigen = split[7];
    }
    
    /**
     * @return the fechaEnvasado
     */
    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    /**
     * @param fechaEnvasado the fechaEnvasado to set
     */
    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    /**
     * @return the paisOrigen
     */
    public String getPaisOrigen() {
        return paisOrigen;
    }

    /**
     * @param paisOrigen the paisOrigen to set
     */
    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }
    
    
}