/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionbankboston;

/**
 *
 * @author ccabe
 */
public class CuentaAhorro extends CuentaBase{
    private double tasaInteres = 0.02;

    public CuentaAhorro(int numeroCuenta) {
        super(numeroCuenta);
    }

    public CuentaAhorro(int numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }
    
    @Override
    public boolean girar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            return true;
        }
        return false;
    }
    
    @Override
    public String tipoCuenta() {
        return "Ahorro";
    }
    
    //metodo para calcular interes
    public double calcularInteres() {
        return saldo * tasaInteres;
    }
    
}
