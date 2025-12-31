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
public class GenerarSerieA {
    public String generarSerie (int n){
        String s = "";
        int acumulador = 0 ;
        for (int index = 1 ; index< n; index++){
            acumulador = siguienteSerie(index);
            s = s + Integer.toString(acumulador) + " , ";
        }
        return s ;
    }

    private int siguienteSerie(int index) {
         if (index ==1)
         return 1 ;
        return index * 10 ; 
    }
    
    public static void main (String[]args) {
        GenerarSerieA s = new GenerarSerieA();
        String r = s.generarSerie(5);
        System.out.println(r);
    }
}
