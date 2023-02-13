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
public class ServicioDeEntrega extends Pedido {

    
    private String fechaEstimada;
    private String cantidadDeProductosEnPedido;
    private String ciudad;
    private String provincia;
    private String direccion;
    
    /**
     * @return the fechaEstimada
     */
    public String getFechaEstimada() {
        return fechaEstimada;
    }

    /**
     * @param fechaEstimada the fechaEstimada to set
     */
    public void setFechaEstimada(String fechaEstimada) {
        this.fechaEstimada = fechaEstimada;
    }

    /**
     * @return the cantidadDeProductosEnPedido
     */
    public String getCantidadDeProductosEnPedido() {
        return cantidadDeProductosEnPedido;
    }

    /**
     * @param cantidadDeProductosEnPedido the cantidadDeProductosEnPedido to set
     */
    public void setCantidadDeProductosEnPedido(String cantidadDeProductosEnPedido) {
        this.cantidadDeProductosEnPedido = cantidadDeProductosEnPedido;
    }

    /**
     * @return the ciudad
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * @param ciudad the ciudad to set
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
