/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cursos.capitulo2.tipos;

import java.util.HashSet;

/**
 *
 * @author Ricardo.huarte
 */
public class Intermedia implements Runnable {
public static void main (String args[]){
    
    //paso 1 crear el thread
    
    Runnable r=new Intermedia();
    
    
    Thread t1=new Thread(r);
    Thread t2=new Thread(r);
        Thread t3=new Thread(r);
        t1.start();
        t2.start();
        t3.start();
        t1.setName("Impresión");
        t2.setName("Conexión");
        t3.setName("Guardar");
    
    
    
            
            
}
    
    
    

@Override
    public void run() {
    
        
        try {
        if( Thread.currentThread().getName().equals("Conexión")) Thread.sleep(2000);
        if( Thread.currentThread().getName().equals("Impresión")) Thread.sleep(4000);
        if( Thread.currentThread().getName().equals("Guardar")) Thread.sleep(6000);
            //if( Thread.currentThread().getName().equals(Thread.currentThread().getName()) )Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName());
        
              
        
        
        
        }catch(Exception e){}
    }
    
}