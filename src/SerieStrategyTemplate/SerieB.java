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
    protected int next(int accumulator, int index) {
        return accumulator + (index * 2);
    }
}