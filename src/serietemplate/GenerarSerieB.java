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

///generar seie 1+100+1000
public class GenerarSerieB extends TemplateMethod{
     @Override
    protected int calcularTermino(int i) {
        return (int) Math.pow(10, i - 1);
    }
}
