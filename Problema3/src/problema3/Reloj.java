/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Alan
 */
public class Reloj extends Thread {
    int tiempo;
   public int segundos;
    int minutos;
    JLabel time;
     public static boolean bandera=false;

    public Reloj(JLabel time) {
        this.time = time;
        this.tiempo=0;
        this.segundos=0;
        this.minutos=0;
    }

     
    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public JLabel getTime() {
        return time;
    }

    public void setTime(JLabel time) {
        this.time = time;
    }

    public static boolean isBandera() {
        return bandera;
    }

    public static void setBandera(boolean bandera) {
        Reloj.bandera = bandera;
    }
    
    
    @Override
    public void run(){
        
        try{
           
            // minutos=1;
             segundos=0;
             time.setText("00");  
             
         while(true){
             
                  this.sleep(1000);
                  segundos++;
                  Ventanaprincipal.contadortiempo++;
                  time.setText(String.valueOf(segundos));
             
           
             
             
             if((Ventanaprincipal.muerte1==true&&Ventanaprincipal.muerte2==true)){  
           
                this.stop();
               
            //  JOptionPane.showMessageDialog(null, "Fin del juego: "+"\n"+"Naves destruidas: "+Juego.jlNaveDestruida.getText()
              //  +"\n"+"Puntuación: "+Juego.jlpuntaje.getText());
           
               return;
               
             }
         }
        
   
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"¡¡Ha habido un problema con el contador!!");
        }
        
        
    }
}
