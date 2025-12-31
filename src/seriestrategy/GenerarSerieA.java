/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriestrategy;

/**
 *
 * @author valde
 */

public class GenerarSerieA implements Strategy {
    @Override
    public String generarSerie(int n) {
        String s = "";
        int valor = 0;
        
        for (int i = 1; i <= n; i++) {
            valor = valor + i;  // Números triangulares: 1, 3, 6, 10, 15...
            s = s + valor;
            if (i < n) {
                s = s + ", ";
            }
        }
        return s;
    }
}