/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursos.capitulo2.tipos;

/**
 *
 * @author Ricardo.huarte
 */
public class ArregloString {
    
    public static void main (String args[]){
        
        String arreglo1[]={"mango","fresa","melon","sandia","aguacate"};
        
        for (String x:arreglo1)
        {
            System.out.println( arreglo1[x]);
            
        }
        
    }
    
    
    //static palabrareservada en java, modificador
    //no se puedeasignar a variables locales
    /*se puede asignar a atributos metodos y bloques, no a varibles lovcales
    */
    
}
