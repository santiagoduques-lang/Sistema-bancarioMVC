/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.Cuenta;
import modelo.CuentaAhorros;
import modelo.CuentaCorriente;
import modelo.Fecha;

/**
 *
 * @author gabby
 */
public class ControladorBanco {

    private CuentaAhorros cuentaAhorros;
    private CuentaCorriente cuentaCorriente;

    public ControladorBanco() {
        cuentaAhorros = null;    
        cuentaCorriente = null;
    }

    public String crearCuentaAhorros(String numero, String dueno, int dia, int mes, int anio,
                                     double saldo) {
        Fecha fecha = new Fecha(dia, mes, anio);
        if (saldo > 0) {
            cuentaAhorros = new CuentaAhorros(numero, dueno, fecha, saldo);
        } else {
            cuentaAhorros = new CuentaAhorros(numero, dueno, fecha);  
        }
        return "Cuenta creada:\n" + cuentaAhorros.obtenerDatos();
    }

    public String crearCuentaCorriente(String numero, String dueno, int dia, int mes, int anio,
                                       double saldo, double cupo) {
        Fecha fecha = new Fecha(dia, mes, anio);
        if (saldo > 0) {
            cuentaCorriente = new CuentaCorriente(numero, dueno, fecha, saldo, cupo);
        } else {
            cuentaCorriente = new CuentaCorriente(numero, dueno, fecha, cupo); 
        }
        return "Cuenta creada:\n" + cuentaCorriente.obtenerDatos();
    }

 
    public Cuenta obtenerCuenta(int tipo) {
        if (tipo == 1) {
            return cuentaAhorros;
        } else {
            return cuentaCorriente;
        }
    }
    
      public String consignar(int tipo, double valor) {
        Cuenta cuenta = obtenerCuenta(tipo);
        if (cuenta == null) {
            return "Primero debe crear esa cuenta.";
        }
        if (cuenta.consignar(valor)) {
            return "Consignación exitosa.\n" + cuenta.obtenerDatos(true);
        } else {
            return "El valor a consignar debe ser mayor que 0.";
        }
    }

    public String retirar(int tipo, double valor) {
        Cuenta cuenta = obtenerCuenta(tipo);
        if (cuenta == null) {
            return "Primero debe crear esa cuenta.";
        }
        if (cuenta.retirar(valor)) {  
            return "Retiro exitoso.\n" + cuenta.obtenerDatos(true);
        } else {
            return "Retiro rechazado: fondos insuficientes o valor no válido.\n"
                    + cuenta.obtenerDatos(true);
        }
    }

    public String verSaldo(int tipo) {
        Cuenta cuenta = obtenerCuenta(tipo);
        if (cuenta == null) {
            return "Primero debe crear esa cuenta.";
        }
        return cuenta.obtenerDatos(true);
    }

    public String verDatos(int tipo) {
        Cuenta cuenta = obtenerCuenta(tipo);
        if (cuenta == null) {
            return "Primero debe crear esa cuenta.";
        }
        return cuenta.obtenerDatos();
    }
}
