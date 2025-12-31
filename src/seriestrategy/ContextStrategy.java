/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriestrategy;

/**
 *
 * @author valde
 */
public class ContextStrategy {
        private Strategy strategy;
            
        ///cargar strategy method
        public void setStrategy (Strategy strategy) {
           this.strategy = strategy ;
        }
        //ejecutar strategy
        public String ejecutarStrategy (int n) {
            
            return this.strategy.generarSerie( n);
        } 
}
