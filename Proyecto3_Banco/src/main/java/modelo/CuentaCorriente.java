/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gabby
 */
    public class CuentaCorriente extends Cuenta {

    private double cupoSobregiro;

    public CuentaCorriente(String numero, String nombreDueño, Fecha fechaApertura,
                           double saldo, double cupoSobregiro) {
        super(numero, nombreDueño, fechaApertura, saldo);
        this.cupoSobregiro = cupoSobregiro;
    }

    public CuentaCorriente(String numero, String nombreDueño, Fecha fechaApertura,
                           double cupoSobregiro) {
        super(numero, nombreDueño, fechaApertura);
        this.cupoSobregiro = cupoSobregiro;
    }

    public double getCupoSobregiro() {
        return cupoSobregiro;
    }

    public void setCupoSobregiro(double cupoSobregiro) {
        this.cupoSobregiro = cupoSobregiro;
    }
       @Override
    public boolean retirar(double valor) {
        if (valor > 0 && valor <= getSaldo() + cupoSobregiro) {
            setSaldo(getSaldo() - valor);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String obtenerDatos() {
        return "CUENTA CORRIENTE | " + super.obtenerDatos()
                + " | Cupo de sobregiro: " + cupoSobregiro
                + " | Disponible para retirar: " + (getSaldo() + cupoSobregiro);
    }

    
    
    }
