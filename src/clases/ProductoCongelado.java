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
public class ProductoCongelado extends Producto {

    //variables
    
    private String tempRecomendada;
    

    public ProductoCongelado(String nombre, String descripcion, String codigoDeProducto, String fechaCaducidad, String numLote, String precio, String tipoDeProducto, String tempRecomendada) {
        super(nombre, descripcion, codigoDeProducto, fechaCaducidad, numLote, precio, tipoDeProducto);
        this.tempRecomendada = tempRecomendada;
        
    }
    
    public ProductoCongelado(String[] split){
    super(split[0], split[1], split[2], split[3], split[4], split[5], split[7]);
    this.tempRecomendada = split[6];
        
        
        
        
    }
    /**
     * @return the tempRecomendada
     */
    public String getTempRecomendada() {
        return tempRecomendada;
    }

    /**
     * @param tempRecomendada the tempRecomendada to set
     */
    public void setTempRecomendada(String tempRecomendada) {
        this.tempRecomendada = tempRecomendada;
    }
    
    
}