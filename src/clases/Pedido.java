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
public class Pedido extends Cliente {
    private String nombre_producto;
    private String cantidad;
    private double precio_total;
    private String stock;
   
    public Pedido() {
        
        this.nombre_producto="";
        this.cantidad="";
        this.precio_total=0.0;
        this.stock="";
        
    }

    public void Pedido(String nombre_producto, String cantidad, double precio_total, String stock) {
        this.nombre_producto=nombre_producto;
        this.cantidad=cantidad;
        this.precio_total=precio_total;
        this.stock=stock;
        
    }
   
    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(double precio_total) {
        this.precio_total = precio_total;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
    
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Nombre Producto: "+nombre_producto+"Cantidad: "+cantidad+"Precio Total: "+precio_total+"Stock: "+stock);
    }
}
