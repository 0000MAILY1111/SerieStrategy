/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerieStrategyTemplate;

//import serietemplate.*;

/**
 *
 * @author valde
 */
public abstract class TemplateMethod {
        ///metodo plantilla , operacion primitiva (se utiliza la funcion primitva dentro del metodo plantilla)
     // Método template - define el algoritmo general
    public final String generateSerie(int n) {
        StringBuilder result = new StringBuilder();
        int accumulator = 0;
        
        for (int i = 1; i <= n; i++) {
            accumulator = next(accumulator, i);
            result.append(accumulator);
            if (i < n) {
                result.append(", ");
            }
        }
        
        return result.toString();
    }
    
    // Método abstracto 
    protected abstract int next(int accumulator, int index);
}

