
import java.util.logging.Level;
import java.util.logging.Logger;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KEVIN GARCIA
 */
public class ClaseInicial extends Thread{
    
    public ClaseInicial(){
    }
    
    @Override
    public void run(){
        System.out.println("Entraaaaaaa");
        Cliente obj=new Cliente(InterfazGrafica.J);
        Thread hilo=new Thread(obj);
        hilo.start();
        try {
            hilo.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(ClaseInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Cliente obj1=new Cliente(InterfazGrafica.J);
        Thread hilo1=new Thread(obj1);
        hilo1.start();
            
        Cliente obj2=new Cliente(InterfazGrafica.J);
        Thread hilo2=new Thread(obj2);
        hilo2.start();
    }
    
}
