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
public class Cliente {
    private String nombre;
    private String apellido;
    private long DNI;
    private String mail;
    private String direccion;
    private String telefono;
   
     public Cliente() {
        this.nombre = "";
        this.apellido = "";
        this.DNI = 0;
        this.mail = "";
        this.direccion = "";
        this.telefono = "";
        
    }

    public Cliente(String nombre, String apellido, long DNI, String mail, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.mail = mail;
        this.direccion = direccion;
        this.telefono = telefono;
        
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public void mostrar(){
        System.out.println("Nombre: "+nombre+"Apellido: "+apellido+"DNI: "+DNI+"Mail: "+mail+"Telefono: "+telefono);
    }
    
}
