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
public abstract class Producto implements Comparable<Producto> {

    // variables
    private String nombre;
    private String descripcion;
    private String codigoDeProducto;
    private String fechaCaducidad;
    private String numLote;
    private String precio;
    private String tipoDeProducto;
    

    /**
     * @param nombre
     * @param descripcion
     * @param fechaCaducidad
     * @param numLote
     * @param precio
     */
    
    public Producto(String nombre, String descripcion, String codigoDeProducto, String fechaCaducidad, String numLote, String precio,String tipoDeProducto) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigoDeProducto = codigoDeProducto;
        this.fechaCaducidad = fechaCaducidad;
        this.numLote = numLote;
        this.precio = precio;
        this.tipoDeProducto = tipoDeProducto;
    }
    public Producto(String[] split){
        
        this.nombre = split[0];
       this.descripcion = split[1];
       this.codigoDeProducto = split[2];
       this.fechaCaducidad = split[3];
       this.numLote = split[4];
       this.precio = split[5];
       this.tipoDeProducto = split[6];
        
        
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fechaCaducidad
     */
    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    /**
     * @param fechaCaducidad the fechaCaducidad to set
     */
    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    /**
     * @return the numLote
     */
    public String getNumLote() {
        return numLote;
    }

    /**
     * @param numLote the numLote to set
     */
    public void setNumLote(String numLote) {
        this.numLote = numLote;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }
    public String getCodigoDeProducto() {
        return codigoDeProducto;
    }

    public void setCodigoDeProducto(String codigoDeProducto) {
        this.codigoDeProducto = codigoDeProducto;
    }
    public String getTipoDeProducto() {
        return tipoDeProducto;
    }

    public void setTipoDeProducto(String tipoDeProducto) {
        this.tipoDeProducto = tipoDeProducto;
    }
    
    @Override
    public int compareTo(Producto p){
    return this.getNombre().compareTo(p.getNombre());
    }
    

}
