/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author gabby
 */
public class Cuenta {
      private String numero;
    private String nombreDueno;
    private Fecha fechaApertura;
    private double saldo;

    /** SOBRECARGA 1 del constructor: con saldo inicial. */
    public Cuenta(String numero, String nombreDueno, Fecha fechaApertura, double saldo) {
        this.numero = numero;
        this.nombreDueno = nombreDueno;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }

    /** SOBRECARGA 2 del constructor: sin saldo inicial (empieza en 0). */
    public Cuenta(String numero, String nombreDueno, Fecha fechaApertura) {
        this.numero = numero;
        this.nombreDueno = nombreDueno;
        this.fechaApertura = fechaApertura;
        this.saldo = 0;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getNombreDueno() { return nombreDueno; }
    public void setNombreDueno(String nombreDueno) { this.nombreDueno = nombreDueno; }

    public Fecha getFechaApertura() { return fechaApertura; }
    public void setFechaApertura(Fecha fechaApertura) { this.fechaApertura = fechaApertura; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }
    
     public boolean consignar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            return true;
        } else {
            return false;
        }
    }
     public boolean retirar(double valor) {
        return false;
    }
}
