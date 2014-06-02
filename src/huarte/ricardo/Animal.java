/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package huarte.ricardo;

/**
 *
 * @author Ricardo.huarte
 */
public class Animal {
   private String nombre;
       private   float   peso;
               int     edad; 
                       boolean carnivoro;
                       
                       public void  setNombre(String nombre)
                       {
                           this.nombre=nombre ;
                       }
                       
                       public String getNombre(){
                           return  nombre;
                       }
    
                       public float getPeso(){
                          return peso;
                       }
                       
                       public void setPeso(float peso){
                           this.peso=peso;
                       }
                             public int  getEdad(){
                          return edad;
                       }
                       
                       public void setEdad(int edad){
                           this.edad=edad;
                           
                           
                           
                       }
                       public boolean getCarnivoro(){
                          return carnivoro;
                       }
                       
                       public void setCarnivoro(boolean carnivoro){
                           this.carnivoro=carnivoro;
                       }
}
