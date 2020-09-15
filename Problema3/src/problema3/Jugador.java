/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

/**
 *
 * @author Alan
 */
public class Jugador extends Thread{
   public int posx;
    public int posy;
    JLabel imagen;
    int vidas;
    int puntos;
    Rectangle rectangulo;
    private final int IZQUIERDAJ1=0;
    public Jugador(JLabel imagen) {
        this.posx = 0;
        this.posy = 0;
        this.imagen = imagen;
        this.rectangulo=new Rectangle();
        this.rectangulo.setBounds(imagen.getX(),imagen.getY(),imagen.getWidth(),imagen.getHeight());
        this.vidas=3;
        this.puntos=0;
    }

    public int getPosx() {
        return posx;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public int getPosy() {
        return posy;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public JLabel getImagen() {
        return imagen;
    }

    public void setImagen(JLabel imagen) {
        this.imagen = imagen;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
    
   @Override
    public void run() {
        while (true){
   this.imagen.setLocation(posx, posx);
   
              }
    /*  switch (Ventanaprincipal.mov1) {

            case KeyEvent.VK_A:
                if (imagen.getX() >= 0) {
                    imagen.setLocation(this.posx - 10, this.posy);
                }
                break;
            case KeyEvent.VK_D:
                if (imagen.getX() < 700) {
                    imagen.setLocation(this.posx + 10, this.posy);
                }
                break;

            case KeyEvent.VK_J:
                if (imagen.getX() >= 0) {
                    imagen.setLocation(this.posx - 10, this.posy);
                }
                break;

            case KeyEvent.VK_L:
                if (imagen.getX()< 700) {
                    imagen.setLocation(this.posx + 10, this.posy);
                }
                break;
            // case KeyEvent.VK_SPACE:
            //    disparo(navej.getY() + 20);
            //   break;
        }*/
    }
    
    
    
      private void movernaves(java.awt.event.KeyEvent evt) {
        this.posx = imagen.getX();
        this.posy = imagen.getY();
          System.out.println("ESTOY EN MOVER NAVES");
        switch (evt.getExtendedKeyCode()) {

            case KeyEvent.VK_A:
                if (imagen.getX() >= 0) {
                    imagen.setLocation(this.posx - 10, this.posy);
                }
                break;
            case KeyEvent.VK_D:
                if (imagen.getX() < 700) {
                    imagen.setLocation(this.posx + 10, this.posy);
                }
                break;

            case KeyEvent.VK_J:
                if (imagen.getX() >= 0) {
                    imagen.setLocation(this.posx - 10, this.posy);
                }
                break;

            case KeyEvent.VK_L:
                if (imagen.getX()< 700) {
                    imagen.setLocation(this.posx + 10, this.posy);
                }
                break;
            // case KeyEvent.VK_SPACE:
            //    disparo(navej.getY() + 20);
            //   break;
        }
    }
}
