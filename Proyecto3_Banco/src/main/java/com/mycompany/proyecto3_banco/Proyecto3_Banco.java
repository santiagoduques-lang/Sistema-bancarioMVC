/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto3_banco;

/**
 *
 * @author gabby
 */

import controlador.ControladorBanco;
import vista.Vista;

public class Proyecto3_Banco {

    public static void main(String[] args) {
        ControladorBanco controlador = new ControladorBanco();
        Vista vista = new Vista(controlador);
    }
}
