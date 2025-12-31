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

public class GenerarSerieB implements Strategy {
    @Override
    public String generarSerie(int n) {
        String s = "";
        
        for (int i = 0; i < n; i++) {
            s = s + (int)Math.pow(10, i);  
            if (i < n - 1) {
                s = s + ", ";
            }
        }
        return s;
    }
}