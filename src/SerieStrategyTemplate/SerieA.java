/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerieStrategyTemplate;

/**
 *
 * @author valde
 */
public class SerieA extends TemplateMethod {
    
    @Override
    protected int calcularElemento(int posicion) {
        return posicion; // Serie: 1, 2, 3, 4, 5...
    }
}
