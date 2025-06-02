/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacionbankboston;

/**
 *
 * @author ccabe
 */
public class CuentaCredito extends CuentaBase{
    private double limiteCredito = 1000000.0;

    public CuentaCredito(int numeroCuenta) {
        super(numeroCuenta);
    }

    public CuentaCredito(int numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }
    
     @Override
    public boolean girar(double monto) {
    // Permite un único retiro hasta el límite de crédito
    if (monto > 0 && monto <= limiteCredito) {
        // Aumenta tu deuda (saldo se vuelve negativo)
        saldo -= monto;
        return true;
    }
    return false;
}
    
    @Override
    public String tipoCuenta() {
        return "Credito";
    }
    
    //metodo para verificar limite al girar
    public boolean dentroDeLimite(double monto) {
        return (saldo - monto) >= -limiteCredito;
    }
    
    public double getLimiteCredito() {
        return limiteCredito;
    }
    
   
}
