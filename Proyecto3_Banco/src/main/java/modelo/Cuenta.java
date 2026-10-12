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
    private String nombreDueño;
    private Fecha fechaApertura;
    private double saldo;

    /** SOBRECARGA 1 del constructor: con saldo inicial. */
    public Cuenta(String numero, String nombreDueo, Fecha fechaApertura, double saldo) {
        this.numero = numero;
        this.nombreDueño = nombreDueño;
        this.fechaApertura = fechaApertura;
        this.saldo = saldo;
    }

    /** SOBRECARGA 2 del constructor: sin saldo inicial (empieza en 0). */
    public Cuenta(String numero, String nombreDueno, Fecha fechaApertura) {
        this.numero = numero;
        this.nombreDueño = nombreDueno;
        this.fechaApertura = fechaApertura;
        this.saldo = 0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
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
     
 public String obtenerDatos() {
        return "Número: " + numero + " | Dueño: " + nombreDueño + " | Fecha de apertura: " + fechaApertura + " | Saldo: " + saldo;
    }

 
    public String obtenerDatos(boolean soloSaldo) {
        if (soloSaldo) {
            return "Saldo de la cuenta " + numero + ": " + saldo;
        } else {
            return obtenerDatos();
        }
    }
}
