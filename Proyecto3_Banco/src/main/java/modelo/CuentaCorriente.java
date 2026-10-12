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

    public CuentaCorriente(String numero, String nombreDueno, Fecha fechaApertura,
                           double saldo, double cupoSobregiro) {
        super(numero, nombreDueno, fechaApertura, saldo);
        this.cupoSobregiro = cupoSobregiro;
    }

    public CuentaCorriente(String numero, String nombreDueno, Fecha fechaApertura,
                           double cupoSobregiro) {
        super(numero, nombreDueno, fechaApertura);
        this.cupoSobregiro = cupoSobregiro;
    }

    public double getCupoSobregiro() { return cupoSobregiro; }
    public void setCupoSobregiro(double cupoSobregiro) { this.cupoSobregiro = cupoSobregiro; }
}
