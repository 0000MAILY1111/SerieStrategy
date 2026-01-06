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
       // Método plantilla (no se puede sobrescribir)
    public final String generarSerie(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(calcularElemento(i)).append(" ");
        }
        return sb.toString().trim();
    }
    
    // Método abstracto: cada subclase define cómo calcular el elemento
    protected abstract int calcularElemento(int posicion);
}