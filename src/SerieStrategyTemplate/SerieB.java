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
public class SerieB extends TemplateMethod {
 @Override
    protected int calcularElemento(int posicion) {
        return posicion * posicion; // Serie: 1, 4, 9, 16, 25...
    }
}