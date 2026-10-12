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
}
