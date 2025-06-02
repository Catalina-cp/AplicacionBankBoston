/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionbankboston;

/**
 *
 * @author ccabe
 */
public abstract class CuentaBase {
    protected int numeroCuenta;
    protected double saldo;

    //constructor
    public CuentaBase(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }
    
    //constructor
    public CuentaBase(int numeroCuenta, double saldoInicial) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }
    
    //getters
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public boolean depositar(double monto) {
        if (monto > 0){
            saldo += monto;
            return true;
        }
        return false;
    }
    
    public abstract boolean girar(double monto);
    
    //metodo abstracto
    public abstract String tipoCuenta();
    
}
