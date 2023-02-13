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
public class ProductoRefrigerado extends Producto {

    //variables
    
    private String codigoDeOrganismo;

    public ProductoRefrigerado(String nombre, String descripcion, String codigoDeProducto, String fechaCaducidad, String numLote, String precio,String tipoDeProducto, String codigoDeOrganismo) {
        super(nombre, descripcion,codigoDeProducto, fechaCaducidad, numLote, precio, tipoDeProducto);
        this.codigoDeOrganismo = codigoDeOrganismo;
    }
    public ProductoRefrigerado(String[] split){
    super(split[0], split[1], split[2], split[3], split[4], split[5], split[7]);
    this.codigoDeOrganismo = split[6];
    }
    
    /**
     * @return the codigoDeOrganismo
     */
    public String getCodigoDeOrganismo() {
        return codigoDeOrganismo;
    }

    /**
     * @param codigoDeOrganismo the codigoDeOrganismo to set
     */
    public void setCodigoDeOrganismo(String codigoDeOrganismo) {
        this.codigoDeOrganismo = codigoDeOrganismo;
    }
    
    
}
