    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gabby
 */
public class CuentaAhorros extends Cuenta {

    public CuentaAhorros(String numero, String nombreDueno, Fecha fechaApertura, double saldo) {
        super(numero, nombreDueno, fechaApertura, saldo);
    }

    public CuentaAhorros(String numero, String nombreDueno, Fecha fechaApertura) {
        super(numero, nombreDueno, fechaApertura);
    }

    @Override
    public boolean retirar(double valor) {
        if (valor > 0 && valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String obtenerDatos() {
        return "CUENTA DE AHORROS | " + super.obtenerDatos();
    }
}

