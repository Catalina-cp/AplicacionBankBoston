/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionbankboston;

/**
 *
 * @author ccabe
 */
public class Cliente implements InfoCliente{
    //Atributos de la clase
    private String rut, nombre, apellidoPaterno, apellidoMaterno, domicilio, comuna, telefono;
    private CuentaBase cuenta;
    
    //Crear constructores, uno vacio y otro con todo los atributos

    public Cliente() {
    }

    public Cliente(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String domicilio, String comuna, String telefono, CuentaBase cuenta) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.domicilio = domicilio;
        this.comuna = comuna;
        this.telefono = telefono;
        this.cuenta = cuenta;
    }

    //Crear getters y setters

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public CuentaBase getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBase cuenta) {
        this.cuenta = cuenta;
    }

    //mostrar datos 
    public void mostrarDatos (){
        System.out.println("Rut: " + rut);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + apellidoPaterno);
        System.out.println("Apellido Materno: " + apellidoMaterno);
        System.out.println("Domicilio: " + domicilio);
        System.out.println("Comuna: " + comuna);
        System.out.println("Teléfono: " + telefono);
        System.out.println("Numero de cuenta: " + cuenta.getNumeroCuenta());
        System.out.println("Saldo: " + cuenta.getSaldo() + " pesos");
        System.out.println("Tipo de cuenta: " + cuenta.tipoCuenta());
        
    }
    
    //implemento interfaz infoCliente
    @Override
    public void mostrarInfo() {
        mostrarDatos();
    }
}
