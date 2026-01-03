/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serietemplate;

/**
 *
 * @author valde
 */
public class GenerarSerieC {
    public String generarSerie(int n) {
        String s = "";
        
        for (int i = 0; i < n; i++) {
            s = s + (i*i); // serie de 2 en 2 implementada 
            if (i < n - 1) {
                s = s + ", ";
            }
        }
        return s;
    }
}
