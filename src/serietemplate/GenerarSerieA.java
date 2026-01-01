/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serietemplate;

/**
 * 
 * 
 * @author valde
 */
public class GenerarSerieA extends TemplateMethod{
     @Override
    protected int calcularTermino(int i) {
        return i * (i + 1) / 2;
    }
}
