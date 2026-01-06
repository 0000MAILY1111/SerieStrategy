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
public class ContextStrategy {
    private TemplateMethod strategy;

    public void setStrategy(TemplateMethod strategy) {
        this.strategy = strategy;
    }

    public String generarSerie(int n) {
        return strategy.generarSerie(n);
    }
}