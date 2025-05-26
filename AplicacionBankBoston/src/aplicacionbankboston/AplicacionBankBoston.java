/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionbankboston;

/**
 *
 * @author ccabe
 */

import java.util.Scanner;

public class AplicacionBankBoston {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        
        Cliente cliente = null; // Cliente aun no registrado
        int opcion;
        
        do {
            System.out.println("\n ***** BIENVENIDO A BANK BOSTON *****\n");
            System.out.println("*** MENU PRINCIPAL ***");
            System.out.println("Selecciona una opcion   ");
            System.out.println("1.- Registrar cliente");
            System.out.println("2.- Ver datos de cliente");
            System.out.println("3.- Depositar");
            System.out.println("4.- Girar");
            System.out.println("5.- Consultar saldo");
            System.out.println("6.- Salir");
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    if (cliente == null) {
                        System.out.print("\nIngrese RUT (11.111.111-1): ");
                        String rut = scanner.nextLine();
                        
                        if (rut.length() < 11 || rut.length() > 12) {
                            System.out.println("El rut es invalido. Debe llevar puntos y guion");
                            break;
                        }
                        System.out.print("Ingrese nombre: ");
                        String nombre = scanner.nextLine();
                        
                        System.out.print("Ingrese apellido paterno: ");
                        String apellidoPaterno = scanner.nextLine();
                    
                        System.out.print("Ingrese apellido materno: ");
                        String apellidoMaterno = scanner.nextLine();
                        
                        System.out.print("Ingrese domicilio: ");
                        String domicilio = scanner.nextLine();
                        
                        System.out.print("Ingrese comuna: ");
                        String comuna = scanner.nextLine();
                        
                        System.out.print("Ingrese telefono: ");
                        String telefono = scanner.nextLine();
                        
                        System.out.print("Ingrese numero de cuenta corriente: ");
                        int numeroCuenta = scanner.nextInt();
                        scanner.nextLine();
                        
                        
                        Cuenta cuenta = new Cuenta(numeroCuenta);
                        
                        cliente = new Cliente(rut, nombre, apellidoPaterno, apellidoMaterno, domicilio, comuna, telefono, cuenta);
                        System.out.println("\n*Cliente registrado exitosamente*\n");
                        
                    }else{
                        System.out.println("Ya existe un cliente registrado");
                    }
                    break;
                    
                case 2:
                    if (cliente != null) {
                        cliente.mostrarDatos();
                    } else {
                        System.out.println("Debe registrar un cliente primero");
                    }
                    break;
                    
                case 3: 
                    if (cliente != null) {
                        System.out.print("\nIngrese un monto para depositar: \n");
                        int monto = scanner.nextInt();
                        
                        if (cliente.getCuenta().depositar(monto)) {
                            System.out.println("\nDeposito realizado de manera exitosa");
                            System.out.println("Usted tiene un saldo actual de: " + cliente.getCuenta().getSaldo() + " pesos\n");
                            
                        }else {
                            System.out.println("\nMonto invalido. Ingrese un monto mayor a cero.\n");
                        }
                        
                    }else {
                        System.out.println("Debe ingresar un cliente primero");
                    }
                    break;
                    
                case 4:
                    if (cliente != null) {
                        System.out.print("\nIngrese un monto para girar\n");
                        int monto = scanner.nextInt();
                        
                        if (cliente.getCuenta().girar(monto)) {
                            System.out.println("\n* Giro realizado de manera exitosa *\n");
                            System.out.println("Usted tiene un saldo actual de: " + cliente.getCuenta().getSaldo() + " pesos\n");
                            
                        }else {
                            System.out.println("\n** Monto invalido o insuficiente **\n");
                        }
                        
                    }else {
                        System.out.println("Debe ingresar un cliente primero");
                    }
                    break;
                
                case 5:
                    if (cliente != null) {
                        System.out.println("\nSaldo actual: " + cliente.getCuenta().getSaldo() + " pesos\n");
                        
                    }else {
                        System.out.println("Debe ingresar un cliente primero");
                    }
                    break;
                
                case 6:
                    System.out.println("Saliento del sistema... Hasta luego");
                    break;
                    
                default:
                    System.out.println("Opcion invalida. Intentelo nuevamente");
                    
            }
            
        } while (opcion != 6);
        
        scanner.close();
        
    }
    
}
