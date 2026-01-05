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
    
    public String generateSerie(int n) {
        if (strategy == null) {
            throw new IllegalStateException("No se ha establecido ninguna estrategia");
        }
        return strategy.generateSerie(n);
    }
    
    public void setStrategy(TemplateMethod strategy) {
        this.strategy = strategy;
    }
    
    public TemplateMethod getStrategy() {
        return strategy;
    }  

    
    
}