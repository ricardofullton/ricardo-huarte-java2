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
public class Alumno {
    private String nombreMateria;
    private float examenParcial;
    private float practicas;
    private float examenFinal;
    private float asistencia;
    private String nombreAlumno;
    
    /**
     * metodo set 
     * @param examenParcial 
     */
    public void setExamenParcial (float examenParcial)
    {
        
        if (examenParcial <= 10)
        
            {
        this.examenParcial=examenParcial;
        System.out.println("ya ajustamos el examen parcial");
    }
            else{
                    
                    
        System.out.println("No se puede poner más de diez en la evaluacion"
                + " el valor se ajustará a 0 por tramposo");
        this.examenParcial=0;
                    }
    }
        
    //poner un solo metodo para revisar las calificaciones 
    /**
     * 
     * @return 
     */
        public float getExamenParcial(){
            
            return examenParcial;
                    //return siempre para el get 
            
                    
        }
        
        
    }
    
    

