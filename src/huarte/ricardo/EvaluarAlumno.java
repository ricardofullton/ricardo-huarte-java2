/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package huarte.ricardo;

/**
 *
 * @author ricardo.huarte
 */
public class EvaluarAlumno {

public static void main(String args[]){
      Alumno a=new Alumno();
        //Manera que funciona pero incorrecta!!! de asignarle valore s los atributos
   a.setExamenParcial(12);
   System.out.println(a.getExamenParcial());
   
   
}
}