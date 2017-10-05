/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

import java.util.*;

/**
 * Este programa ejecuta la fecha del día de hoy.
 */
public class Ex01 {

    public static void main(String[] args) {
        // ES MOSTRA LA DATA ACTUAL
        System.out.println("05 de Octubre de 2017");
        
        // Variable de hora.
        Date dataActual = new Date();
        System.out.println(dataActual.toString());
    }
    
}
