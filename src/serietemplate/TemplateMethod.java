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
public abstract class TemplateMethod {
        ///metodo plantilla , operacion primitiva (se utiliza la funcion primitva dentro del metodo plantilla)
    public final String generarSerie(int n) {
        StringBuilder s = new StringBuilder(); 
        for (int index = 1; index <= n; index++) { 
            int valor = calcularTermino(index);
            s.append(valor);
            if (index < n) {
                s.append(", ");
            }
        }
        return s.toString();
    }

    protected abstract int calcularTermino(int index);
    
    
}

